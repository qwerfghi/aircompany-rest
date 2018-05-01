package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.CountryDTO;
import com.qwerfghi.aircompany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{code}")
    public CountryDTO getCountry(@PathVariable("code") String code) {
        return countryService.getCountryById(code);
    }

    @GetMapping
    public List<CountryDTO> getCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public void addCountry(@RequestBody CountryDTO countryDTO) {
        countryService.addCountry(countryDTO);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable("code") String code) {
        countryService.deleteCountry(code);
    }

    @PutMapping("/{code}")
    public void updateCountry(@PathVariable("code") String code, @RequestBody CountryDTO countryDTO) {
        countryDTO.setCode(code);
        countryService.updateCountry(countryDTO);
    }
}
