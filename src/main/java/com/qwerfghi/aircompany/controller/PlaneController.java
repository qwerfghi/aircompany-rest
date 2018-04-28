package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Plane;
import com.qwerfghi.aircompany.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/planes")
public class PlaneController {
    private final PlaneService planeService;

    @Autowired
    public PlaneController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping("/{id}")
    public Plane getPlane(@PathVariable("id") int id) {
        return planeService.getPlaneById(id);
    }

    @GetMapping
    public List<Plane> getPlanes() {
        return planeService.getAllPlanes();
    }

    @PostMapping
    public void addPlane(@RequestBody Plane plane) {
        planeService.addPlane(plane);
    }

    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable("id") int id) {
        planeService.deletePlane(id);
    }

    @PutMapping
    public void updatePlane(@RequestBody Plane plane) {
        planeService.updatePlane(plane);
    }
}
