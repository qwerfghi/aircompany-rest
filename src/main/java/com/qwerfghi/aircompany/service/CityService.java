package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.CityDTO;
import com.qwerfghi.aircompany.repository.dto.CityDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {
    private final CityDTORepository cityDTORepository;

    @Autowired
    public CityService(CityDTORepository cityDTORepository) {
        this.cityDTORepository = cityDTORepository;
    }

    @Transactional(readOnly = true)
    public CityDTO getCityById(int id) {
        return cityDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<CityDTO> getAllCities() {
        return cityDTORepository.findAll();
    }

    public void addCity(CityDTO cityDTO) {
        cityDTORepository.save(cityDTO);
    }

    public void deleteCity(int id) {
        cityDTORepository.delete(id);
    }

    public void updateCity(CityDTO cityDTO) {
        cityDTORepository.save(cityDTO);
    }
}
