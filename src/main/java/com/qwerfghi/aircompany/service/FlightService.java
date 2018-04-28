package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Flight;
import com.qwerfghi.aircompany.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FlightService {
    private final FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Transactional(readOnly = true)
    public Flight getFlightById(int id) {
        return flightRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public void addFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public void deleteFlight(int id) {
        flightRepository.delete(id);
    }

    public void updateFlight(Flight flight) {
        flightRepository.save(flight);
    }
}
