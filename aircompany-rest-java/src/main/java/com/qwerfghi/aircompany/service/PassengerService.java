package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PassengerDTO;
import com.qwerfghi.aircompany.repository.dto.PassengerDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PassengerService {
    private final PassengerDTORepository passengerDTORepository;

    @Autowired
    public PassengerService(PassengerDTORepository passengerDTORepository) {
        this.passengerDTORepository = passengerDTORepository;
    }

    @Transactional(readOnly = true)
    public PassengerDTO getPassengerById(int id) {
        return passengerDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PassengerDTO> getAllPassengers() {
        return passengerDTORepository.findAll();
    }

    public void addPassenger(PassengerDTO passengerDTO) {
        passengerDTORepository.save(passengerDTO);
    }

    public void deletePassenger(int id) {
        passengerDTORepository.delete(id);
    }

    public void updatePassenger(PassengerDTO passengerDTO) {
        passengerDTORepository.save(passengerDTO);
    }
}
