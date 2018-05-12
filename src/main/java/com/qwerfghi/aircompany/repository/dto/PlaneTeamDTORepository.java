package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.PlaneTeamDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneTeamDTORepository extends JpaRepository<PlaneTeamDTO, Integer> {
}
