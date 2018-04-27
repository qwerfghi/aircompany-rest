package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
}
