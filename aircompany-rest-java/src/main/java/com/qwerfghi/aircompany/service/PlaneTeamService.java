package com.qwerfghi.aircompany.service;

import com.qwerfghi.aircompany.entity.dto.PlaneTeamDTO;
import com.qwerfghi.aircompany.repository.dto.PlaneTeamDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlaneTeamService {
    private final PlaneTeamDTORepository teamRepository;

    @Autowired
    public PlaneTeamService(PlaneTeamDTORepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Transactional(readOnly = true)
    public PlaneTeamDTO getTeamById(int id) {
        return teamRepository.findOne(id);
    }

    @Transactional(readOnly = true)
    public List<PlaneTeamDTO> getAllTeams() {
        return teamRepository.findAll();
    }

    public void addTeam(PlaneTeamDTO teamDTO) {
        teamRepository.save(teamDTO);
    }

    public void deleteTeam(int id) {
        teamRepository.delete(id);
    }

    public void updateTeam(PlaneTeamDTO teamDTO) {
        teamRepository.save(teamDTO);
    }
}
