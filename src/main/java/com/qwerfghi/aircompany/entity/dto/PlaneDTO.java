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
    private Integer teamId;

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

    public void setBusinessClassCount(Integer blassCount) {
        this.businessClassCount = blassCount;
    }

    @Basic
    @Column(name = "economy_class_count")
    public Integer getEconomyClassCount() {
        return economyClassCount;
    }

    public void setEconomyClassCount(Integer eclassCount) {
        this.economyClassCount = eclassCount;
    }

    @Basic
    @Column(name = "team_id")
    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneDTO planeDTO = (PlaneDTO) o;
        return Objects.equals(planeId, planeDTO.planeId) &&
                Objects.equals(model, planeDTO.model) &&
                Objects.equals(businessClassCount, planeDTO.businessClassCount) &&
                Objects.equals(economyClassCount, planeDTO.economyClassCount) &&
                Objects.equals(teamId, planeDTO.teamId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, model, businessClassCount, economyClassCount, teamId);
    }
}
