package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.CountryLanguageDTO;
import com.qwerfghi.aircompany.entity.model.CountryLanguagePK;
import com.qwerfghi.aircompany.service.CountryLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countrylanguages")
public class CountryLanguageController {
    private final CountryLanguageService countryLanguageService;

    @Autowired
    public CountryLanguageController(CountryLanguageService countryLanguageService) {
        this.countryLanguageService = countryLanguageService;
    }

    @GetMapping("/")
    public CountryLanguageDTO getCountry(@RequestParam("code") String code, @RequestParam("language") String language) {
        CountryLanguagePK countryLanguagePK = new CountryLanguagePK();
        countryLanguagePK.setCountryCode(code);
        countryLanguagePK.setLanguage(language);
        return countryLanguageService.getCountryLanguageById(countryLanguagePK);
    }

    @GetMapping
    public List<CountryLanguageDTO> getCountries() {
        return countryLanguageService.getAllCountryLanguages();
    }

    @PostMapping
    public void addCountry(@RequestBody CountryLanguageDTO countryDTO) {
        countryLanguageService.addCountryLanguage(countryDTO);
    }

    @DeleteMapping
    public void deleteCountry(@RequestParam("code") String code, @RequestParam("language") String language) {
        CountryLanguagePK countryLanguagePK = new CountryLanguagePK();
        countryLanguagePK.setCountryCode(code);
        countryLanguagePK.setLanguage(language);
        countryLanguageService.deleteCountryLanguage(countryLanguagePK);
    }

    @PutMapping
    public void updateCountry(@RequestBody CountryLanguageDTO countryDTO) {
        countryLanguageService.updateCountryLanguage(countryDTO);
    }
}
