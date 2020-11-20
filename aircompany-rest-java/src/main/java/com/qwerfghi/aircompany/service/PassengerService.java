package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Passenger;
import com.qwerfghi.aircompany.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PassengerService {

    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Transactional(readOnly = true)
    public Optional<Passenger> getPassengerById(int id) {
        return passengerRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public void deletePassenger(int id) {
        passengerRepository.deleteById(id);
    }

    public void updatePassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }
}
