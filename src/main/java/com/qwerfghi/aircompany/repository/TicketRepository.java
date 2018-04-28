package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.TicketDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<TicketDTO, Integer> {
}
