package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "country", schema = "aircompany")
public class CountryDTO {
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surfaceArea;
    private Short indepYear;
    private Integer population;
    private String localName;
    private String governmentForm;
    private String code2;

    @Id
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "continent")
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "surface_area")
    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Basic
    @Column(name = "indep_year")
    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    @Basic
    @Column(name = "population")
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Basic
    @Column(name = "local_name")
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    @Basic
    @Column(name = "government_form")
    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    @Basic
    @Column(name = "code2")
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryDTO countryDTO = (CountryDTO) o;
        return Objects.equals(code, countryDTO.code) &&
                Objects.equals(name, countryDTO.name) &&
                Objects.equals(continent, countryDTO.continent) &&
                Objects.equals(region, countryDTO.region) &&
                Objects.equals(surfaceArea, countryDTO.surfaceArea) &&
                Objects.equals(indepYear, countryDTO.indepYear) &&
                Objects.equals(population, countryDTO.population) &&
                Objects.equals(localName, countryDTO.localName) &&
                Objects.equals(governmentForm, countryDTO.governmentForm) &&
                Objects.equals(code2, countryDTO.code2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(code, name, continent, region, surfaceArea, indepYear, population, localName, governmentForm, code2);
    }
}