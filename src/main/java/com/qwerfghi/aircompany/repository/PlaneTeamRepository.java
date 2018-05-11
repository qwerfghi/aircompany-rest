package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.PlaneTeamDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneTeamRepository extends JpaRepository<PlaneTeamDTO, Integer> {
}
