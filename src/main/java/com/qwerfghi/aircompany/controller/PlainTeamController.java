package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.dto.PlaneTeamDTO;
import com.qwerfghi.aircompany.service.PlaneTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class PlainTeamController {
    private final PlaneTeamService planeTeamService;

    @Autowired
    public PlainTeamController(PlaneTeamService planeTeamService) {
        this.planeTeamService = planeTeamService;
    }

    @GetMapping
    public List<PlaneTeamDTO> getTeams() {
        return planeTeamService.getAllTeams();
    }

    @PostMapping
    public void addTeam(@RequestBody PlaneTeamDTO teamDTO) {
        planeTeamService.addTeam(teamDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable("id") int id) {
        planeTeamService.deleteTeam(id);
    }
}
