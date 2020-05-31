package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.Sex;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "person", schema = "aircompany")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer personId;

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

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "country", foreignKey = @ForeignKey(name = "person_country_fk"))
    @JsonIgnore
    private Country country;

    @Column(name = "country", insertable = false, updatable = false)
    private String countryCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", foreignKey = @ForeignKey(name = "person_address_fk"))
    @JsonIgnore
    private Address address;

    @Column(name = "address_id", insertable = false, updatable = false)
    private Integer addressId;
}
