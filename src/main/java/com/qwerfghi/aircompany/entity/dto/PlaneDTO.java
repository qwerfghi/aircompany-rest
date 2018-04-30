package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plane", schema = "aircompany")
public class PlaneDTO {
    private Integer planeId;
    private String model;
    private Integer businessClassCount;
    private Integer economyClassCount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneDTO planeDTO = (PlaneDTO) o;
        return Objects.equals(planeId, planeDTO.planeId) &&
                Objects.equals(model, planeDTO.model) &&
                Objects.equals(businessClassCount, planeDTO.businessClassCount) &&
                Objects.equals(economyClassCount, planeDTO.economyClassCount);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, model, businessClassCount, economyClassCount);
    }
}
