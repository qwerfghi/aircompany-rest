package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Address;
import com.qwerfghi.aircompany.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional(readOnly = true)
    public Address getAddressById(int id) {
        return addressRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public void deleteAddress(int id) {
        addressRepository.delete(id);
    }

    public void updateAddress(Address address) {
        addressRepository.save(address);
    }
}
