package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plane", schema = "aircompany")
public class PlaneDTO {
    private Integer planeId;
    private String model;
    private Integer hoursInflight;
    private Integer businessClassCount;
    private Integer economyClassCount;
    private Integer baggageCount;
    private String registrationNumber;
    private String status;

    @Id
    @Column(name = "plane_id")
    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "hours_inflight")
    public Integer getHoursInflight() {
        return hoursInflight;
    }

    public void setHoursInflight(Integer hoursInflight) {
        this.hoursInflight = hoursInflight;
    }

    @Basic
    @Column(name = "business_class_count")
    public Integer getBusinessClassCount() {
        return businessClassCount;
    }

    public void setBusinessClassCount(Integer businessClassCount) {
        this.businessClassCount = businessClassCount;
    }

    @Basic
    @Column(name = "economy_class_count")
    public Integer getEconomyClassCount() {
        return economyClassCount;
    }

    public void setEconomyClassCount(Integer economyClassCount) {
        this.economyClassCount = economyClassCount;
    }

    @Basic
    @Column(name = "baggage_count")
    public Integer getBaggageCount() {
        return baggageCount;
    }

    public void setBaggageCount(Integer baggageCount) {
        this.baggageCount = baggageCount;
    }

    @Basic
    @Column(name = "registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneDTO planeDTO = (PlaneDTO) o;
        return Objects.equals(planeId, planeDTO.planeId) &&
                Objects.equals(model, planeDTO.model) &&
                Objects.equals(hoursInflight, planeDTO.hoursInflight) &&
                Objects.equals(businessClassCount, planeDTO.businessClassCount) &&
                Objects.equals(economyClassCount, planeDTO.economyClassCount) &&
                Objects.equals(baggageCount, planeDTO.baggageCount) &&
                Objects.equals(registrationNumber, planeDTO.registrationNumber) &&
                Objects.equals(status, planeDTO.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, model, hoursInflight, businessClassCount, economyClassCount, baggageCount, registrationNumber, status);
    }
}
