package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDTO, Integer> {
}
