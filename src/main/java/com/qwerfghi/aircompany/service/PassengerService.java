package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PassengerDTO;
import com.qwerfghi.aircompany.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PassengerService {
    private final PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Transactional(readOnly = true)
    public PassengerDTO getPassengerById(int id) {
        return passengerRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PassengerDTO> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public void addPassenger(PassengerDTO passengerDTO) {
        passengerRepository.save(passengerDTO);
    }

    public void deletePassenger(int id) {
        passengerRepository.delete(id);
    }

    public void updatePassenger(PassengerDTO passengerDTO) {
        passengerRepository.save(passengerDTO);
    }
}
