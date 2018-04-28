package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PlaneDTO;
import com.qwerfghi.aircompany.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaneService {
    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Transactional(readOnly = true)
    public PlaneDTO getPlaneById(int id) {
        return planeRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PlaneDTO> getAllPlanes() {
        return planeRepository.findAll();
    }

    public void addPlane(PlaneDTO planeDTO) {
        planeRepository.save(planeDTO);
    }

    public void deletePlane(int id) {
        planeRepository.delete(id);
    }

    public void updatePlane(PlaneDTO planeDTO) {
        planeRepository.save(planeDTO);
    }
}
