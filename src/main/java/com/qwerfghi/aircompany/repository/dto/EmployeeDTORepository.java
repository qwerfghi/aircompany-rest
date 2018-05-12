package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDTORepository extends JpaRepository<EmployeeDTO, Integer> {
}
