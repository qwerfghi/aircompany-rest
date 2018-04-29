package com.qwerfghi.aircompany.entity.dto;

import com.qwerfghi.aircompany.entity.model.CountryLanguagePK;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country_language", schema = "aircompany")
@IdClass(CountryLanguagePK.class)
public class CountryLanguageDTO {
    private String countryCode;
    private String language;
    private Double percentage;

    @Id
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Id
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "percentage")
    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguageDTO that = (CountryLanguageDTO) o;
        return Objects.equals(countryCode, that.countryCode) &&
                Objects.equals(language, that.language) &&
                Objects.equals(percentage, that.percentage);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryCode, language, percentage);
    }
}
