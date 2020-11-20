package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Plane;
import com.qwerfghi.aircompany.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

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
        return planeService.getPlaneById(id)
                .orElseThrow(() -> new ResponseStatusException(NOT_FOUND, "Unable to find plane by specified plane id"));
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

    @PutMapping("/{id}")
    public void updatePlane(@PathVariable("id") int id, @RequestBody Plane plane) {
        plane.setPlaneId(id);
        planeService.updatePlane(plane);
    }
}
