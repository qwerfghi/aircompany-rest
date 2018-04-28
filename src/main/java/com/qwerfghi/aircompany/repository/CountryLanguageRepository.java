package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.dto.CountryLanguage;
import com.qwerfghi.aircompany.entity.dto.CountryLanguagePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguagePK> {
}
