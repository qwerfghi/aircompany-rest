package com.qwerfghi.aircompany.entity.model;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema = "aircompany")
public class Employee {
    private Integer employeeId;
    private String position;
    private String department;
    private Integer salary;
    private Person person;

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

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "employee_person_fk"))
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
