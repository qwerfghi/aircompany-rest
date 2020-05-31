package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "employee", schema = "aircompany")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "position")
    private String position;

    @Column(name = "department")
    private String department;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "work_record_book_number")
    private Integer workRecordBookNumber;

    @Column(name = "person_id", insertable = false, updatable = false)
    private Integer personId;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "employee_person_fk"))
    private Person person;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "plane_team",
            joinColumns = @JoinColumn(name = "employee_id", foreignKey = @ForeignKey(name = "team_employee_fk")),
            inverseJoinColumns = @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "team_plane_fk")))
    private Set<Plane> planes;
}
