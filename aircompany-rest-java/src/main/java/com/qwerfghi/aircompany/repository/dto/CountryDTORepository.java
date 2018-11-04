package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDTORepository extends JpaRepository<CountryDTO, String> {
}
