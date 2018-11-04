package com.qwerfghi.aircompany.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "migration", schema = "aircompany")
public class MigrationDTO {
    private Integer migrationId;
    private Integer departureId;
    private Date departureDate;
    private Integer arrivalId;
    private Date arrivalDate;
    private Integer planeId;
    private Integer cost;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "migration_id")
    public Integer getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date")
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arrival_date")
    @JsonFormat
            (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @Basic
    @Column(name = "departure_id")
    public Integer getDepartureId() {
        return departureId;
    }

    public void setDepartureId(Integer departureId) {
        this.departureId = departureId;
    }

    @Basic
    @Column(name = "arrival_id")
    public Integer getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(Integer arrivalId) {
        this.arrivalId = arrivalId;
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
    @Column(name = "cost")
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
