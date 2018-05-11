package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PlaneTeamDTOPK implements Serializable {
    private Integer planeId;
    private Integer employeeId;

    @Column(name = "plane_id")
    @Id
    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Column(name = "employee_id")
    @Id
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
        PlaneTeamDTOPK that = (PlaneTeamDTOPK) o;
        return Objects.equals(planeId, that.planeId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(planeId, employeeId);
    }
}
