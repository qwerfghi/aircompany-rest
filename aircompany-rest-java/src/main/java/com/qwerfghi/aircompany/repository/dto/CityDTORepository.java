package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.CityDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDTORepository extends JpaRepository<CityDTO, Integer> {
}
