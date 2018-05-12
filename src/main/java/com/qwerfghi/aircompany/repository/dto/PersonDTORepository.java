package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDTORepository extends JpaRepository<PersonDTO, Integer> {
}
