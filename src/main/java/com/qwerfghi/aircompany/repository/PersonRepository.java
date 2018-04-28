package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDTO, Integer> {
}
