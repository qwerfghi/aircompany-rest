package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.City;
import com.qwerfghi.aircompany.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Transactional(readOnly = true)
    public Optional<City> getCityById(int id) {
        return cityRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public void addCity(City city) {
        cityRepository.save(city);
    }

    public void deleteCity(int id) {
        cityRepository.deleteById(id);
    }

    public void updateCity(City city) {
        cityRepository.save(city);
    }
}
