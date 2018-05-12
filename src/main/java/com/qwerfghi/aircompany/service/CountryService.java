package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.CountryDTO;
import com.qwerfghi.aircompany.repository.dto.CountryDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryService {
    private final CountryDTORepository countryDTORepository;

    @Autowired
    public CountryService(CountryDTORepository countryDTORepository) {
        this.countryDTORepository = countryDTORepository;
    }

    @Transactional(readOnly = true)
    public CountryDTO getCountryById(String code) {
        return countryDTORepository.findOne(code);
    }

    @Transactional(readOnly = true)
    public List<CountryDTO> getAllCountries() {
        return countryDTORepository.findAll();
    }

    public void addCountry(CountryDTO countryDTO) {
        countryDTORepository.save(countryDTO);
    }

    public void deleteCountry(String code) {
        countryDTORepository.delete(code);
    }

    public void updateCountry(CountryDTO countryDTO) {
        countryDTORepository.save(countryDTO);
    }
}
