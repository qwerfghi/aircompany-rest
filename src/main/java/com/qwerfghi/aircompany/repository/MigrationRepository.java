package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.MigrationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MigrationRepository extends JpaRepository<MigrationDTO, Integer> {
}
