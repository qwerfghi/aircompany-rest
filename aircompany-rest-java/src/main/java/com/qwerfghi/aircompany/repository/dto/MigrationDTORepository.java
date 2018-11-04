package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.MigrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MigrationDTORepository extends JpaRepository<MigrationDTO, Integer> {
}
