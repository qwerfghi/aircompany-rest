package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.CountryLanguageDTO;
import com.qwerfghi.aircompany.entity.model.CountryLanguagePK;
import com.qwerfghi.aircompany.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CountryLanguageService {
    private final CountryLanguageRepository countryLanguageRepository;

    @Autowired
    public CountryLanguageService(CountryLanguageRepository countryLanguageRepository) {
        this.countryLanguageRepository = countryLanguageRepository;
    }

    @Transactional(readOnly = true)
    public CountryLanguageDTO getCountryLanguageById(CountryLanguagePK id) {
        return countryLanguageRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<CountryLanguageDTO> getAllCountryLanguages() {
        return countryLanguageRepository.findAll();
    }

    public void addCountryLanguage(CountryLanguageDTO countryLanguageDTO) {
        countryLanguageRepository.save(countryLanguageDTO);
    }

    public void deleteCountryLanguage(CountryLanguagePK id) {
        countryLanguageRepository.delete(id);
    }

    public void updateCountryLanguage(CountryLanguageDTO countryLanguageDTO) {
        countryLanguageRepository.save(countryLanguageDTO);
    }
}
