package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
