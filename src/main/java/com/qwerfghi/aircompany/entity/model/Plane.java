package com.qwerfghi.aircompany.entity.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "plane", schema = "aircompany")
public class Plane {
    private Integer planeId;
    private String model;
    private Integer businessClassCount;
    private Integer economyClassCount;
    private Set<Employee> employees;

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

    @ManyToMany
    @JoinTable(name = "team",
            joinColumns = @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "team_plane_fk")),
            inverseJoinColumns = @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "team_employee_fk")))
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
