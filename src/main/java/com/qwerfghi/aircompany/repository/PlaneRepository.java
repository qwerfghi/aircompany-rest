package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.PlaneDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<PlaneDTO, Integer> {
}
