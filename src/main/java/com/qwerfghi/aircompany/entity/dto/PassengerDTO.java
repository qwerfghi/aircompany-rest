package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "passenger", schema = "aircompany")
public class PassengerDTO {
    private Integer passengerId;
    private String name;
    private String lastName;
    private String sex;
    private Date birthdate;
    private String passport;
    private String phone;
    private String countryCode;
    private Integer addressId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
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
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
        PassengerDTO passengerDTO = (PassengerDTO) o;
        return Objects.equals(passengerId, passengerDTO.passengerId) &&
                Objects.equals(name, passengerDTO.name) &&
                Objects.equals(lastName, passengerDTO.lastName) &&
                Objects.equals(sex, passengerDTO.sex) &&
                Objects.equals(birthdate, passengerDTO.birthdate) &&
                Objects.equals(passport, passengerDTO.passport) &&
                Objects.equals(phone, passengerDTO.phone) &&
                Objects.equals(countryCode, passengerDTO.countryCode) &&
                Objects.equals(addressId, passengerDTO.addressId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(passengerId, name, lastName, sex, birthdate, passport, phone, countryCode, addressId);
    }
}
