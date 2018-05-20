package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.PlaneStatus;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "plane", schema = "aircompany")
public class Plane {
    private Integer planeId;
    private String model;
    private Integer hoursInflight;
    private Integer businessClassCount;
    private Integer economyClassCount;
    private Integer baggageCount;
    private String registrationNumber;
    private PlaneStatus status;
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

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "plane_team",
            joinColumns = @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "team_plane_fk")),
            inverseJoinColumns = @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "team_employee_fk")))
    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Basic
    @Column(name = "hours_inflight")
    public Integer getHoursInflight() {
        return hoursInflight;
    }

    public void setHoursInflight(Integer hoursInflight) {
        this.hoursInflight = hoursInflight;
    }

    @Basic
    @Column(name = "baggage_count")
    public Integer getBaggageCount() {
        return baggageCount;
    }

    public void setBaggageCount(Integer baggageCount) {
        this.baggageCount = baggageCount;
    }

    @Basic
    @Column(name = "registration_number")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    public PlaneStatus getStatus() {
        return status;
    }

    public void setStatus(PlaneStatus status) {
        this.status = status;
    }
}
