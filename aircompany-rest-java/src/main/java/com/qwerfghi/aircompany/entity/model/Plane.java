package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.PlaneStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "plane", schema = "aircompany")
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plane_id")
    private Integer planeId;

    @Column(name = "model")
    private String model;

    @Column(name = "hours_inflight")
    private Integer hoursInflight;

    @Column(name = "business_class_count")
    private Integer businessClassCount;

    @Column(name = "economy_class_count")
    private Integer economyClassCount;

    @Column(name = "baggage_count")
    private Integer baggageCount;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PlaneStatus status;

    @ManyToMany
    @JoinTable(name = "plane_team",
            joinColumns = @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "team_plane_fk")),
            inverseJoinColumns = @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "team_employee_fk")))
    @JsonIgnore
    private Set<Employee> employees;
}
