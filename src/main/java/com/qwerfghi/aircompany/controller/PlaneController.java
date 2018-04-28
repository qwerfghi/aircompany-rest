package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.PlaneDTO;
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
    public PlaneDTO getPlane(@PathVariable("id") int id) {
        return planeService.getPlaneById(id);
    }

    @GetMapping
    public List<PlaneDTO> getPlanes() {
        return planeService.getAllPlanes();
    }

    @PostMapping
    public void addPlane(@RequestBody PlaneDTO planeDTO) {
        planeService.addPlane(planeDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable("id") int id) {
        planeService.deletePlane(id);
    }

    @PutMapping
    public void updatePlane(@RequestBody PlaneDTO planeDTO) {
        planeService.updatePlane(planeDTO);
    }
}
