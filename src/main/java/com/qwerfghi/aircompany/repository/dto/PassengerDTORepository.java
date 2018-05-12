package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.PassengerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDTORepository extends JpaRepository<PassengerDTO, Integer> {
}
