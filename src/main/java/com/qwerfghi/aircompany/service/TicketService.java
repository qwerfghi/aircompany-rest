package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.TicketDTO;
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
    public TicketDTO getTicketById(int id) {
        return ticketRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<TicketDTO> getAllTickets() {
        return ticketRepository.findAll();
    }

    public void addTicket(TicketDTO ticketDTO) {
        ticketRepository.save(ticketDTO);
    }

    public void deleteTicket(int id) {
        ticketRepository.delete(id);
    }

    public void updateTicket(TicketDTO ticketDTO) {
        ticketRepository.save(ticketDTO);
    }
}
