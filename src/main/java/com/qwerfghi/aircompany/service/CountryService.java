package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.CountryDTO;
import com.qwerfghi.aircompany.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Transactional(readOnly = true)
    public CountryDTO getCountryById(String code) {
        return countryRepository.findOne(code);
    }

    @Transactional(readOnly = true)
    public List<CountryDTO> getAllCountries() {
        return countryRepository.findAll();
    }

    public void addCountry(CountryDTO countryDTO) {
        countryRepository.save(countryDTO);
    }

    public void deleteCountry(String code) {
        countryRepository.delete(code);
    }

    public void updateCountry(CountryDTO countryDTO) {
        countryRepository.save(countryDTO);
    }
}
