package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.model.Team;
import com.qwerfghi.aircompany.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional(readOnly = true)
    public Team getTeamById(int id) {
        return teamRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public void addTeam(Team plane) {
        teamRepository.save(plane);
    }

    public void deleteTeam(int id) {
        teamRepository.delete(id);
    }

    public void updateTeam(Team plane) {
        teamRepository.save(plane);
    }
}
