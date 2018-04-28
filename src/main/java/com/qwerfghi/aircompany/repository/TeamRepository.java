package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.TeamDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamDTO, Integer> {
}
