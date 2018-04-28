package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employee", schema = "aircompany")
public class EmployeeDTO {
    private Integer employeeId;
    private String position;
    private String department;
    private Integer salary;
    private Integer personId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "salary")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTO employeeDTO = (EmployeeDTO) o;
        return Objects.equals(employeeId, employeeDTO.employeeId) &&
                Objects.equals(position, employeeDTO.position) &&
                Objects.equals(department, employeeDTO.department) &&
                Objects.equals(salary, employeeDTO.salary) &&
                Objects.equals(personId, employeeDTO.personId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(employeeId, position, department, salary, personId);
    }
}
