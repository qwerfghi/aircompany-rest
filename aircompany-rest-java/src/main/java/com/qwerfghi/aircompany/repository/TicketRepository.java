package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
