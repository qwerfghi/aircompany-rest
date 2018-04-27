package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Migration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrationRepository extends JpaRepository<Migration, Integer> {
}
