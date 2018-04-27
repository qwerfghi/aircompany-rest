package com.qwerfghi.aircompany.entity.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Plane {
    private Integer planeId;
    private String model;
    private Integer blassCount;
    private Integer eclassCount;
    private Integer teamId;

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
        Plane plane = (Plane) o;
        return Objects.equals(planeId, plane.planeId) &&
                Objects.equals(model, plane.model) &&
                Objects.equals(blassCount, plane.blassCount) &&
                Objects.equals(eclassCount, plane.eclassCount) &&
                Objects.equals(teamId, plane.teamId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, model, blassCount, eclassCount, teamId);
    }
}
