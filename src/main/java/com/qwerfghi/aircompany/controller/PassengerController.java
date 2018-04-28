package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Passenger;
import com.qwerfghi.aircompany.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {
    private final PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @GetMapping("/{id}")
    public Passenger getPassenger(@PathVariable("id") int id) {
        return passengerService.getPassengerById(id);
    }

    @GetMapping
    public List<Passenger> getPassengers() {
        return passengerService.getAllPassengers();
    }

    @PostMapping
    public void addPassenger(@RequestBody Passenger passenger) {
        passengerService.addPassenger(passenger);
    }

    @DeleteMapping("/{id}")
    public void deletePassenger(@PathVariable("id") int id) {
        passengerService.deletePassenger(id);
    }

    @PutMapping
    public void updatePassenger(@RequestBody Passenger passenger) {
        passengerService.updatePassenger(passenger);
    }
}
