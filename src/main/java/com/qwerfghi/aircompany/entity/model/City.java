package com.qwerfghi.aircompany.entity.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class City {
    private Integer cityId;
    private String name;
    private String countryCode;
    private String district;
    private Integer population;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "population")
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(cityId, city.cityId) &&
                Objects.equals(name, city.name) &&
                Objects.equals(countryCode, city.countryCode) &&
                Objects.equals(district, city.district) &&
                Objects.equals(population, city.population);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cityId, name, countryCode, district, population);
    }
}
