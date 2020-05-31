package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.Sex;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "passenger", schema = "aircompany")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Integer passengerId;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    private Sex sex;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "passport")
    private String passport;

    @Column(name = "phone")
    private String phone;

    @OneToOne
    @JoinColumn(name = "country", foreignKey = @ForeignKey(name = "passenger_country_fk"))
    @JsonIgnore
    private Country country;

    @Column(name = "country", insertable = false, updatable = false)
    private String countryCode;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "address_id", foreignKey = @ForeignKey(name = "passenger_address_fk"))
    @JsonIgnore
    private Address address;

    @Column(name = "address_id", insertable = false, updatable = false)
    private Integer addressId;
}
