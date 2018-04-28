package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.TicketDTO;
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

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable("id") int id) {
        ticketService.deleteTicket(id);
    }

    @PutMapping
    public void updateTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.updateTicket(ticketDTO);
    }
}
