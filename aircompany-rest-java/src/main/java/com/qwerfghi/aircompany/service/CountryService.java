package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Country;
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
    public Country getCountryById(String code) {
        return countryRepository.findOne(code);
    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    public void deleteCountry(String code) {
        countryRepository.delete(code);
    }

    public void updateCountry(Country country) {
        countryRepository.save(country);
    }
}
