package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PlaneDTO;
import com.qwerfghi.aircompany.repository.dto.PlaneDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaneService {
    private final PlaneDTORepository planeDTORepository;

    @Autowired
    public PlaneService(PlaneDTORepository planeDTORepository) {
        this.planeDTORepository = planeDTORepository;
    }

    @Transactional(readOnly = true)
    public PlaneDTO getPlaneById(int id) {
        return planeDTORepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PlaneDTO> getAllPlanes() {
        return planeDTORepository.findAll();
    }

    public void addPlane(PlaneDTO planeDTO) {
        planeDTORepository.save(planeDTO);
    }

    public void deletePlane(int id) {
        planeDTORepository.delete(id);
    }

    public void updatePlane(PlaneDTO planeDTO) {
        planeDTORepository.save(planeDTO);
    }
}
