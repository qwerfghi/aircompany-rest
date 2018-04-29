package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "aircompany")
public class AddressDTO {
    private Integer addressId;
    private String country;
    private String state;
    private String region;
    private String city;
    private String district;
    private String village;
    private Integer houseNumber;
    private Integer apartmentNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
    @Column(name = "village")
    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    @Basic
    @Column(name = "house_number")
    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Basic
    @Column(name = "apartment_number")
    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO addressDTO = (AddressDTO) o;
        return Objects.equals(addressId, addressDTO.addressId) &&
                Objects.equals(country, addressDTO.country) &&
                Objects.equals(state, addressDTO.state) &&
                Objects.equals(region, addressDTO.region) &&
                Objects.equals(city, addressDTO.city) &&
                Objects.equals(district, addressDTO.district) &&
                Objects.equals(village, addressDTO.village) &&
                Objects.equals(houseNumber, addressDTO.houseNumber) &&
                Objects.equals(apartmentNumber, addressDTO.apartmentNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(addressId, country, state, region, city, district, village, houseNumber, apartmentNumber);
    }
}
