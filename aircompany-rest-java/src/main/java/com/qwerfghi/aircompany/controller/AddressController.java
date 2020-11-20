package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Address;
import com.qwerfghi.aircompany.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{id}")
    public Address getAddress(@PathVariable("id") int id) {
        return addressService.getAddressById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find address by specified address id"));
    }

    @GetMapping
    public List<Address> getAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public void addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") int id) {
        addressService.deleteAddress(id);
    }

    @PutMapping("/{id}")
    public void updateAddress(@PathVariable("id") int id, @RequestBody Address address) {
        address.setAddressId(id);
        addressService.updateAddress(address);
    }
}
