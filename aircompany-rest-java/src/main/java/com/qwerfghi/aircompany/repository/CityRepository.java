package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
