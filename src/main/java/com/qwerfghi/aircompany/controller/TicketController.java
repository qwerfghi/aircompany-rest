package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.MigrationDTO;
import com.qwerfghi.aircompany.entity.dto.TicketDTO;
import com.qwerfghi.aircompany.entity.model.Ticket;
import com.qwerfghi.aircompany.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/{id}")
    public TicketDTO getTicket(@PathVariable("id") int id) {
        return ticketService.getTicketById(id);
    }

    @GetMapping
    public List<TicketDTO> getTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping
    public void addTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.addTicket(ticketDTO);
    }

    @PostMapping("/search")
    public List<MigrationDTO> searchTickets(@RequestBody Ticket ticket) {
        return ticketService.getAvailableMigrations(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable("id") int id) {
        ticketService.deleteTicket(id);
    }

    @PutMapping("/{id}")
    public void updateTicket(@PathVariable("id") int id, @RequestBody TicketDTO ticketDTO) {
        ticketDTO.setTicketId(id);
        ticketService.updateTicket(ticketDTO);
    }
}
