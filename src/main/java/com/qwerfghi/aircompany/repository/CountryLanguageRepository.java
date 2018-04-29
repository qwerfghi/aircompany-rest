package com.qwerfghi.aircompany.repository;

import com.qwerfghi.aircompany.entity.model.CountryLanguage;
import com.qwerfghi.aircompany.entity.model.CountryLanguagePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguagePK> {
}
