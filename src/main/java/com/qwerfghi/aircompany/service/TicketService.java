package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Ticket;
import com.qwerfghi.aircompany.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TicketService {
    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Transactional(readOnly = true)
    public Ticket getTicketById(int id) {
        return ticketRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteTicket(int id) {
        ticketRepository.delete(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
