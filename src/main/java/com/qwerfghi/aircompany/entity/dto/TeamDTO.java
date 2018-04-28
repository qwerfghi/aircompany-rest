package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "team", schema = "aircompany")
public class TeamDTO {
    private Integer teamId;
    private Integer planeId;
    private Integer employeeId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Basic
    @Column(name = "plane_id")
    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    @Basic
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
        TeamDTO teamDTO = (TeamDTO) o;
        return Objects.equals(teamId, teamDTO.teamId) &&
                Objects.equals(planeId, teamDTO.planeId) &&
                Objects.equals(employeeId, teamDTO.employeeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teamId, planeId, employeeId);
    }
}
