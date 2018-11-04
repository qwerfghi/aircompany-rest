package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee", schema = "aircompany")
public class Employee {
    private Integer employeeId;
    private String position;
    private String department;
    private Integer salary;
    private Integer workRecordBookNumber;
    private Person person;
    private Set<Plane> planes;

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
    @Column(name = "work_record_book_number")
    public Integer getWorkRecordBookNumber() {
        return workRecordBookNumber;
    }

    public void setWorkRecordBookNumber(Integer workRecordBookNumber) {
        this.workRecordBookNumber = workRecordBookNumber;
    }

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "employee_person_fk"))
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "plane_team",
            joinColumns = @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "team_employee_fk")),
            inverseJoinColumns = @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "team_plane_fk")))
    public Set<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(Set<Plane> planes) {
        this.planes = planes;
    }
}