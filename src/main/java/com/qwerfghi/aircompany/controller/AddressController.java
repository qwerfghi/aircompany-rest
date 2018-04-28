package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Address;
import com.qwerfghi.aircompany.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return addressService.getAddressById(id);
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

    @PutMapping
    public void updateAddress(@RequestBody Address address) {
        addressService.updateAddress(address);
    }
}
