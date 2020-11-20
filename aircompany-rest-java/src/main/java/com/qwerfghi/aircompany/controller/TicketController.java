package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Ticket;
import com.qwerfghi.aircompany.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable("id") int id) {
        return ticketService.getTicketById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to ticket city by specified ticket id"));
    }

    @GetMapping
    public List<Ticket> getTickets() {
        return ticketService.getAllTickets();
    }

    @PostMapping
    public void addTicket(@RequestBody Ticket ticket) {
        ticketService.addTicket(ticket);
    }

    @PostMapping("/search")
    public List<Ticket> searchTickets(@RequestBody Ticket ticket) {
        return ticketService.getAvailableTickets(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable("id") int id) {
        ticketService.deleteTicket(id);
    }

    @PutMapping("/{id}")
    public void updateTicket(@PathVariable("id") int id, @RequestBody Ticket ticket) {
        ticket.setTicketId(id);
        ticketService.updateTicket(ticket);
    }

    @PostMapping("/buy")
    public Ticket buyTicket(@RequestBody Ticket ticket) {
        return ticketService.buyTicket(ticket)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find user by specified user id"));
    }
}
