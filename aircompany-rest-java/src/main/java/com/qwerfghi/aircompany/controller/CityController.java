package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.City;
import com.qwerfghi.aircompany.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable("id") int id) {
        return cityService.getCityById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find city by specified city id"));
    }

    @GetMapping
    public List<City> getCities() {
        return cityService.getAllCities();
    }

    @PostMapping
    public void addCity(@RequestBody City city) {
        cityService.addCity(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable("id") int id) {
        cityService.deleteCity(id);
    }

    @PutMapping("/{id}")
    public void updateCity(@PathVariable("id") int id, @RequestBody City city) {
        city.setCityId(id);
        cityService.updateCity(city);
    }
}
