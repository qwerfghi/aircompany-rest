package com.qwerfghi.aircompany.entity.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Person {
    private Integer personId;
    private String name;
    private String lastName;
    private String sex;
    private Date birthdate;
    private String passport;
    private String phone;
    private String email;
    private Integer workRecordBookNumber;
    private String countryCode;
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
    @Column(name = "work_record_book_number")
    public Integer getWorkRecordBookNumber() {
        return workRecordBookNumber;
    }

    public void setWorkRecordBookNumber(Integer workRecordBookNumber) {
        this.workRecordBookNumber = workRecordBookNumber;
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
        Person person = (Person) o;
        return Objects.equals(personId, person.personId) &&
                Objects.equals(name, person.name) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(sex, person.sex) &&
                Objects.equals(birthdate, person.birthdate) &&
                Objects.equals(passport, person.passport) &&
                Objects.equals(phone, person.phone) &&
                Objects.equals(email, person.email) &&
                Objects.equals(workRecordBookNumber, person.workRecordBookNumber) &&
                Objects.equals(countryCode, person.countryCode) &&
                Objects.equals(addressId, person.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, name, lastName, sex, birthdate, passport, phone, email, workRecordBookNumber, countryCode, addressId);
    }
}
