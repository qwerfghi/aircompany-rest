package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plane_team", schema = "aircompany")
@IdClass(PlaneTeamDTOPK.class)
public class PlaneTeamDTO {
    private Integer planeId;
    private Integer employeeId;

    @Id
    @Column(name = "plane_id")
    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Id
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaneTeamDTO that = (PlaneTeamDTO) o;
        return Objects.equals(planeId, that.planeId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, employeeId);
    }
}
