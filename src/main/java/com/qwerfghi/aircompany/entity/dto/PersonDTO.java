package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "person", schema = "aircompany")
public class PersonDTO {
    private Integer personId;
    private String name;
    private String lastName;
    private String sex;
    private Date birthdate;
    private String passport;
    private String phone;
    private String email;
    private String country;
    private Integer addressId;

    @Id
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthdate")
    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Basic
    @Column(name = "passport")
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "address_id")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(personId, personDTO.personId) &&
                Objects.equals(name, personDTO.name) &&
                Objects.equals(lastName, personDTO.lastName) &&
                Objects.equals(sex, personDTO.sex) &&
                Objects.equals(birthdate, personDTO.birthdate) &&
                Objects.equals(passport, personDTO.passport) &&
                Objects.equals(phone, personDTO.phone) &&
                Objects.equals(email, personDTO.email) &&
                Objects.equals(country, personDTO.country) &&
                Objects.equals(addressId, personDTO.addressId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(personId, name, lastName, sex, birthdate, passport, phone, email, country, addressId);
    }
}
