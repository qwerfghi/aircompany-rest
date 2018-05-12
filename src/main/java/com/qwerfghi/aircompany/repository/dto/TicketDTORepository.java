package com.qwerfghi.aircompany.repository.dto;

import com.qwerfghi.aircompany.entity.dto.TicketDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketDTORepository extends JpaRepository<TicketDTO, Integer> {
}
