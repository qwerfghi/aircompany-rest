package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "aircompany")
public class CityDTO {
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
        CityDTO cityDTO = (CityDTO) o;
        return Objects.equals(cityId, cityDTO.cityId) &&
                Objects.equals(name, cityDTO.name) &&
                Objects.equals(countryCode, cityDTO.countryCode) &&
                Objects.equals(district, cityDTO.district) &&
                Objects.equals(population, cityDTO.population);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cityId, name, countryCode, district, population);
    }
}
