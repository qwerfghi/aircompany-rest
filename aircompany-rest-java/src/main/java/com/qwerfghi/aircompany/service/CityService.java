package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.City;
import com.qwerfghi.aircompany.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {

    private final CityRepository cityDTORepository;

    @Autowired
    public CityService(CityRepository cityDTORepository) {
        this.cityDTORepository = cityDTORepository;
    }

    @Transactional(readOnly = true)
    public City getCityById(int id) {
        return cityDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<City> getAllCities() {
        return cityDTORepository.findAll();
    }

    public void addCity(City cityDTO) {
        cityDTORepository.save(cityDTO);
    }

    public void deleteCity(int id) {
        cityDTORepository.delete(id);
    }

    public void updateCity(City cityDTO) {
        cityDTORepository.save(cityDTO);
    }
}
