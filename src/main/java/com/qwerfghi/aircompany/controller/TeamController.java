package com.qwerfghi.aircompany.controller;

import com.qwerfghi.aircompany.entity.model.Team;
import com.qwerfghi.aircompany.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamService;

    @Autowired
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/{id}")
    public Team getTeam(@PathVariable("id") int id) {
        return teamService.getTeamById(id);
    }

    @GetMapping
    public List<Team> getTeams() {
        return teamService.getAllTeams();
    }

    @PostMapping
    public void addTeam(@RequestBody Team team) {
        teamService.addTeam(team);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable("id") int id) {
        teamService.deleteTeam(id);
    }

    @PutMapping
    public void updateTeam(@RequestBody Team team) {
        teamService.updateTeam(team);
    }
}
