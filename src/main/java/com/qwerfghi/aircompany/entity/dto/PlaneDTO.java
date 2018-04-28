package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plane", schema = "aircompany")
public class PlaneDTO {
    private Integer planeId;
    private String model;
    private Integer blassCount;
    private Integer eclassCount;
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
    @Column(name = "blass_count")
    public Integer getBlassCount() {
        return blassCount;
    }

    public void setBlassCount(Integer blassCount) {
        this.blassCount = blassCount;
    }

    @Basic
    @Column(name = "eclass_count")
    public Integer getEclassCount() {
        return eclassCount;
    }

    public void setEclassCount(Integer eclassCount) {
        this.eclassCount = eclassCount;
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
                Objects.equals(blassCount, planeDTO.blassCount) &&
                Objects.equals(eclassCount, planeDTO.eclassCount) &&
                Objects.equals(teamId, planeDTO.teamId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, model, blassCount, eclassCount, teamId);
    }
}
