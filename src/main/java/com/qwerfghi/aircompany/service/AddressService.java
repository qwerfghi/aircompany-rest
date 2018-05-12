package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.AddressDTO;
import com.qwerfghi.aircompany.repository.dto.AddressDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AddressService {
    private final AddressDTORepository addressDTORepository;

    @Autowired
    public AddressService(AddressDTORepository addressDTORepository) {
        this.addressDTORepository = addressDTORepository;
    }

    @Transactional(readOnly = true)
    public AddressDTO getAddressById(int id) {
        return addressDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<AddressDTO> getAllAddresses() {
        return addressDTORepository.findAll();
    }

    public void addAddress(AddressDTO addressDTO) {
        addressDTORepository.save(addressDTO);
    }

    public void deleteAddress(int id) {
        addressDTORepository.delete(id);
    }

    public void updateAddress(AddressDTO addressDTO) {
        addressDTORepository.save(addressDTO);
    }
}
