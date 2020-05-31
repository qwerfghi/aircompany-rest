package com.qwerfghi.aircompany.entity.model;

import com.qwerfghi.aircompany.entity.enums.Continent;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "country", schema = "aircompany")
public class Country {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "continent")
    private Continent continent;

    @Column(name = "region")
    private String region;

    @Column(name = "surface_area")
    private Double surfaceArea;

    @Column(name = "population")
    private Integer population;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "code2")
    private String code2;
}
