package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.MigrationDTO;
import com.qwerfghi.aircompany.entity.dto.TicketDTO;
import com.qwerfghi.aircompany.entity.model.Ticket;
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

@Service
@Transactional
public class TicketService {
    private final TicketDTORepository ticketDTORepository;
    private final EntityManager entityManager;

    @Autowired
    public TicketService(TicketDTORepository ticketDTORepository, EntityManager entityManager) {
        this.ticketDTORepository = ticketDTORepository;
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

    public List<MigrationDTO> getAvailableMigrations(Ticket ticket) {
        int cost = 0;
        Date departureDate = ticket.getMigration().getDepartureDate();
        Date departureDateStart = getStartOrEndDate(departureDate, true);
        Date departureDateEnd = getStartOrEndDate(departureDate, false);
        TypedQuery<MigrationDTO> query = entityManager.createQuery("from MigrationDTO m " +
                "where m.departureId = :departureId and m.arrivalId = :arrivalId and" +
                " m.departureDate between :departureDateStart and :departureDateEnd", MigrationDTO.class);
        query.setParameter("departureDateStart", departureDateStart);
        query.setParameter("departureDateEnd", departureDateEnd);
        query.setParameter("departureId", ticket.getMigration().getDeparture().getCityId());
        query.setParameter("arrivalId", ticket.getMigration().getArrival().getCityId());
        return query.getResultList();
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

    public List<MigrationDTO> getTicketsByMigration(Ticket ticket) {
        return null;
    }
}
