package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.CityDTO;
import com.qwerfghi.aircompany.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Transactional(readOnly = true)
    public CityDTO getCityById(int id) {
        return cityRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<CityDTO> getAllCities() {
        return cityRepository.findAll();
    }

    public void addCity(CityDTO cityDTO) {
        cityRepository.save(cityDTO);
    }

    public void deleteCity(int id) {
        cityRepository.delete(id);
    }

    public void updateCity(CityDTO cityDTO) {
        cityRepository.save(cityDTO);
    }
}
