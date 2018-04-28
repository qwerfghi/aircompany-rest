package com.qwerfghi.aircompany.entity.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Migration {
    private Integer migrationId;
    private Integer departureId;
    private Date departureDate;
    private Integer arrivalId;
    private Date arrivalDate;
    private Integer planeId;
    private Integer cost;
    private String clazz;
    private Integer placeNumber;

    @Id
    @Column(name = "migration_id")
    public Integer getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
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
    @Column(name = "departure_date")
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
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
    @Column(name = "arrival_date")
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    @Basic
    @Column(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "place_number")
    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Migration migration = (Migration) o;
        return Objects.equals(migrationId, migration.migrationId) &&
                Objects.equals(departureId, migration.departureId) &&
                Objects.equals(departureDate, migration.departureDate) &&
                Objects.equals(arrivalId, migration.arrivalId) &&
                Objects.equals(arrivalDate, migration.arrivalDate) &&
                Objects.equals(planeId, migration.planeId) &&
                Objects.equals(cost, migration.cost) &&
                Objects.equals(clazz, migration.clazz) &&
                Objects.equals(placeNumber, migration.placeNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(migrationId, departureId, departureDate, arrivalId, arrivalDate, planeId, cost, clazz, placeNumber);
    }
}
