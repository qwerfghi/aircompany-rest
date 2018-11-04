package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.AddressDTO;
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
    public AddressDTO getAddress(@PathVariable("id") int id) {
        return addressService.getAddressById(id);
    }

    @GetMapping
    public List<AddressDTO> getAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping
    public void addAddress(@RequestBody AddressDTO addressDTO) {
        addressService.addAddress(addressDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable("id") int id) {
        addressService.deleteAddress(id);
    }

    @PutMapping("/{id}")
    public void updateAddress(@PathVariable("id") int id, @RequestBody AddressDTO addressDTO) {
        addressDTO.setAddressId(id);
        addressService.updateAddress(addressDTO);
    }
}
