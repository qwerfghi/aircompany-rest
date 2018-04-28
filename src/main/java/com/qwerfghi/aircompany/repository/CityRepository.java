package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.CityDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityDTO, Integer> {
}
