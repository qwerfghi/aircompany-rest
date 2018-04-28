package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.TeamDTO;
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
    public TeamDTO getTeamById(int id) {
        return teamRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<TeamDTO> getAllTeams() {
        return teamRepository.findAll();
    }

    public void addTeam(TeamDTO teamDTO) {
        teamRepository.save(teamDTO);
    }

    public void deleteTeam(int id) {
        teamRepository.delete(id);
    }

    public void updateTeam(TeamDTO teamDTO) {
        teamRepository.save(teamDTO);
    }
}
