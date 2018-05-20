package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.TicketDTO;
import com.qwerfghi.aircompany.entity.enums.TicketClass;
import com.qwerfghi.aircompany.entity.model.*;
import com.qwerfghi.aircompany.repository.TicketRepository;
import com.qwerfghi.aircompany.repository.UserRepository;
import com.qwerfghi.aircompany.repository.dto.TicketDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TicketService {
    private final TicketDTORepository ticketDTORepository;
    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Autowired
    public TicketService(TicketDTORepository ticketDTORepository,
                         TicketRepository ticketRepository,
                         UserRepository userRepository,
                         EntityManager entityManager) {
        this.ticketDTORepository = ticketDTORepository;
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public TicketDTO getTicketById(int id) {
        return ticketDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<TicketDTO> getAllTickets() {
        return ticketDTORepository.findAll();
    }

    public void addTicket(TicketDTO ticketDTO) {
        ticketDTORepository.save(ticketDTO);
    }

    public void deleteTicket(int id) {
        ticketDTORepository.delete(id);
    }

    public void updateTicket(TicketDTO ticketDTO) {
        ticketDTORepository.save(ticketDTO);
    }

    public void buyTicket(Ticket ticket) {
        User user = userRepository.findOne(ticket.getPassenger().getPassengerId());
        ticket.setPassenger(createPassengerByPerson(user.getPerson()));
        ticketRepository.save(ticket);
    }

    @Transactional(readOnly = true)
    public List<Ticket> getAvailableTickets(Ticket ticket) {
        Date departureDate = ticket.getMigration().getDepartureDate();
        Date departureDateStart = getStartOrEndDate(departureDate, true);
        Date departureDateEnd = getStartOrEndDate(departureDate, false);

        TypedQuery<Migration> query = entityManager.createQuery("from Migration m " +
                "where m.departure = :departure and m.arrival = :arrival and" +
                " m.departureDate between :departureDateStart and :departureDateEnd", Migration.class);
        query.setParameter("departureDateStart", departureDateStart);
        query.setParameter("departureDateEnd", departureDateEnd);
        query.setParameter("departure", ticket.getMigration().getDeparture());
        query.setParameter("arrival", ticket.getMigration().getArrival());

        return query.getResultList()
                .stream()
                .filter(migration -> isFreeTicketsAvailable(ticket, migration))
                .map(migration -> createTicketByFormInformation(ticket, migration))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public int getBusinessTicketsCount(Migration migration) {
        TypedQuery<Long> query = entityManager.createQuery("select count(*) from Ticket t " +
                "where t.migration = :migration " +
                "and t.clazz = :ticketClass", Long.class);
        query.setParameter("migration", migration);
        query.setParameter("ticketClass", TicketClass.BUSINESS);
        return Math.toIntExact(query.getSingleResult());
    }

    @Transactional(readOnly = true)
    public int getEconomyTicketsCount(Migration migration) {
        TypedQuery<Long> query = entityManager.createQuery("select count(*) from Ticket t " +
                "where t.migration = :migration " +
                "and t.clazz = :ticketClass", Long.class);
        query.setParameter("migration", migration);
        query.setParameter("ticketClass", TicketClass.ECONOMY);
        return Math.toIntExact(query.getSingleResult());
    }

    @Transactional(readOnly = true)
    public int getBaggageTicketsCount(Migration migration, boolean baggageAvailable) {
        TypedQuery<Long> query = entityManager.createQuery("select count(*) from Ticket t " +
                "where t.migration = :migration " +
                "and t.baggageAvailable = :baggageAvailable", Long.class);
        query.setParameter("migration", migration);
        query.setParameter("baggageAvailable", baggageAvailable);
        return Math.toIntExact(query.getSingleResult());
    }

    private boolean isFreeTicketsAvailable(Ticket ticket, Migration migration) {
        boolean freeTicketsAvailable = false;
        if (ticket.getClazz().equals(TicketClass.BUSINESS) && ticket.getBaggageAvailable()) {
            int businessTicketsCount = getBusinessTicketsCount(migration);
            int businessClassCount = migration.getPlane().getBusinessClassCount();
            int baggageTicketsCount = getBaggageTicketsCount(migration, ticket.getBaggageAvailable());
            int baggageCount = migration.getPlane().getBaggageCount();
            freeTicketsAvailable = baggageCount > baggageTicketsCount && businessClassCount > businessTicketsCount;
        } else if (ticket.getClazz().equals(TicketClass.BUSINESS)) {
            int businessTicketsCount = getBusinessTicketsCount(migration);
            int businessClassCount = migration.getPlane().getBusinessClassCount();
            freeTicketsAvailable = businessClassCount > businessTicketsCount;
        } else if (ticket.getClazz().equals(TicketClass.ECONOMY) && ticket.getBaggageAvailable()) {
            int economyTicketsCount = getEconomyTicketsCount(migration);
            int economyClassCount = migration.getPlane().getEconomyClassCount();
            int baggageTicketsCount = getBaggageTicketsCount(migration, ticket.getBaggageAvailable());
            int baggageCount = migration.getPlane().getBaggageCount();
            freeTicketsAvailable = baggageCount > baggageTicketsCount && economyClassCount > economyTicketsCount;
        } else if (ticket.getClazz().equals(TicketClass.ECONOMY)) {
            int economyTicketsCount = getEconomyTicketsCount(migration);
            int economyClassCount = migration.getPlane().getEconomyClassCount();
            freeTicketsAvailable = economyClassCount > economyTicketsCount;
        }
        return freeTicketsAvailable;
    }

    private Ticket createTicketByFormInformation(Ticket ticket, Migration migration) {
        Ticket newTicket = new Ticket();
        newTicket.setClazz(ticket.getClazz());
        newTicket.setBaggageAvailable(ticket.getBaggageAvailable());
        newTicket.setExchangeAvailable(ticket.getExchangeAvailable());
        newTicket.setReturnAvailable(ticket.getReturnAvailable());
        newTicket.setMigration(migration);
        newTicket.setPassenger(ticket.getPassenger());
        newTicket.setStatus(false);

        newTicket.setCost(calculateTicketCost(migration.getCost(),
                ticket.getBaggageAvailable(),
                ticket.getExchangeAvailable(),
                ticket.getReturnAvailable(),
                ticket.getClazz()));
        return newTicket;
    }

    private Passenger createPassengerByPerson(Person person) {
        Passenger passenger = new Passenger();
        passenger.setAddress(person.getAddress());
        passenger.setBirthdate(person.getBirthdate());
        passenger.setCountry(person.getCountry());
        passenger.setName(person.getName());
        passenger.setLastName(person.getLastName());
        passenger.setPassport(person.getPassport());
        passenger.setPhone(person.getPhone());
        passenger.setSex(person.getSex());
        return passenger;
    }

    private int calculateTicketCost(int migrationCost,
                                    boolean baggageAvailable,
                                    boolean exchangeAvailable,
                                    boolean returnAvailable,
                                    TicketClass ticketClass) {
        int cost = migrationCost;
        cost += baggageAvailable ? 20 : 0;
        cost += exchangeAvailable ? 30 : 0;
        cost += returnAvailable ? 40 : 0;
        cost += ticketClass.equals(TicketClass.ECONOMY) ? 20 : 60;
        return cost;
    }

    private Date getStartOrEndDate(Date departureDate, boolean getStart) {
        Calendar cal = new GregorianCalendar();
        if (getStart) {
            cal.setTime(departureDate);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
        } else {
            cal.setTime(departureDate);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 0);
        }
        return cal.getTime();
    }
}
