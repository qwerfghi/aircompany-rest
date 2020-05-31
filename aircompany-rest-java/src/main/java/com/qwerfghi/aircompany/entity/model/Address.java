package com.qwerfghi.aircompany.entity.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "address", schema = "aircompany")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "village")
    private String village;

    @Column(name = "street")
    private String street;

    @Column(name = "house_number")
    private Integer houseNumber;

    @Column(name = "apartment_number")
    private Integer apartmentNumber;
}
