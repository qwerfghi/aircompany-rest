package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Country;
import com.qwerfghi.aircompany.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable("code") String code) {
        return countryService.getCountryById(code)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find country by specified country code"));
    }

    @GetMapping
    public List<Country> getCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping
    public void addCountry(@RequestBody Country country) {
        countryService.addCountry(country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable("code") String code) {
        countryService.deleteCountry(code);
    }

    @PutMapping("/{code}")
    public void updateCountry(@PathVariable("code") String code, @RequestBody Country country) {
        country.setCode(code);
        countryService.updateCountry(country);
    }
}
