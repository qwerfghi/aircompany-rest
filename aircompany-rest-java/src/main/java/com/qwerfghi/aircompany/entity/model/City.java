package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "city", schema = "aircompany")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_code", foreignKey = @ForeignKey(name = "city_country_fk"))
    @JsonIgnore
    private Country country;

    @Column(name = "district")
    private String district;

    @Column(name = "population")
    private Integer population;

    @Column(name = "country_code", insertable = false, updatable = false)
    private String countryCode;
}
