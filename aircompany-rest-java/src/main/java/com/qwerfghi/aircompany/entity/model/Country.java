package com.qwerfghi.aircompany.entity.model;

import com.qwerfghi.aircompany.entity.enums.Continent;

import javax.persistence.*;

@Entity
@Table(name = "country", schema = "aircompany")
public class Country {
    private String code;
    private String name;
    private Continent continent;
    private String region;
    private Double surfaceArea;
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

    @Column(name = "continent")
    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
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
}
