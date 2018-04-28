package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
