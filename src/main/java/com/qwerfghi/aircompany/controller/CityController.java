package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.CityDTO;
import com.qwerfghi.aircompany.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {
    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/{id}")
    public CityDTO getCity(@PathVariable("id") int id) {
        return cityService.getCityById(id);
    }

    @GetMapping
    public List<CityDTO> getCities() {
        return cityService.getAllCities();
    }

    @PostMapping
    public void addCity(@RequestBody CityDTO cityDTO) {
        cityService.addCity(cityDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable("id") int id) {
        cityService.deleteCity(id);
    }

    @PutMapping("/{id}")
    public void updateCity(@PathVariable("id") int id, @RequestBody CityDTO cityDTO) {
        cityDTO.setCityId(id);
        cityService.updateCity(cityDTO);
    }
}
