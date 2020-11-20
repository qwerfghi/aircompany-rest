package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Passenger;
import com.qwerfghi.aircompany.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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
        return passengerService.getPassengerById(id).orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find passenger by specified passenger id"));
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

    @PutMapping("/{id}")
    public void updatePassenger(@PathVariable("id") int id, @RequestBody Passenger passenger) {
        passenger.setPassengerId(id);
        passengerService.updatePassenger(passenger);
    }
}
