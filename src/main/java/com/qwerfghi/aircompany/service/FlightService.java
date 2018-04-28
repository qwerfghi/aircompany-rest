package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.FlightDTO;
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
    public FlightDTO getFlightById(int id) {
        return flightRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<FlightDTO> getAllFlights() {
        return flightRepository.findAll();
    }

    public void addFlight(FlightDTO flightDTO) {
        flightRepository.save(flightDTO);
    }

    public void deleteFlight(int id) {
        flightRepository.delete(id);
    }

    public void updateFlight(FlightDTO flightDTO) {
        flightRepository.save(flightDTO);
    }
}
