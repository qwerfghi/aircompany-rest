package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.PlaneDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneDTORepository extends JpaRepository<PlaneDTO, Integer> {
}
