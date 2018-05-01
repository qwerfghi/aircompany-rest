package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.FlightDTO;
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
    public FlightDTO getFlight(@PathVariable("id") int id) {
        return flightService.getFlightById(id);
    }

    @GetMapping
    public List<FlightDTO> getFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping
    public void addFlight(@RequestBody FlightDTO flightDTO) {
        flightService.addFlight(flightDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable("id") int id) {
        flightService.deleteFlight(id);
    }

    @PutMapping("/{id}")
    public void updateFlight(@PathVariable("id") int id, @RequestBody FlightDTO flightDTO) {
        flightDTO.setFlightId(id);
        flightService.updateFlight(flightDTO);
    }
}
