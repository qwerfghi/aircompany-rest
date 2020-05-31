package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Plane;
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
    public Plane getPlaneById(int id) {
        return planeRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }

    public void addPlane(Plane plane) {
        planeRepository.save(plane);
    }

    public void deletePlane(int id) {
        planeRepository.delete(id);
    }

    public void updatePlane(Plane plane) {
        planeRepository.save(plane);
    }
}
