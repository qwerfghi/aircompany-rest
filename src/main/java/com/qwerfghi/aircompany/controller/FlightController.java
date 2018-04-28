package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Flight;
import com.qwerfghi.aircompany.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable("id") int id) {
        return flightService.getFlightById(id);
    }

    @GetMapping
    public List<Flight> getFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping
    public void addFlight(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable("id") int id) {
        flightService.deleteFlight(id);
    }

    @PutMapping
    public void updateFlight(@RequestBody Flight flight) {
        flightService.updateFlight(flight);
    }
}
