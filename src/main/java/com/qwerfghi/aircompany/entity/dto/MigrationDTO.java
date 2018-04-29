package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "migration", schema = "aircompany")
public class MigrationDTO {
    private int migrationId;
    private int departureId;
    private Date departureDate;
    private int arrivalId;
    private Date arrivalDate;
    private int planeId;
    private int placeNumber;

    @Id
    @Column(name = "migration_id")
    public int getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(int migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Column(name = "departure_id")
    public int getDepartureId() {
        return departureId;
    }

    public void setDepartureId(int departureId) {
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
    public int getArrivalId() {
        return arrivalId;
    }

    public void setArrivalId(int arrivalId) {
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
    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    @Basic
    @Column(name = "place_number")
    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MigrationDTO that = (MigrationDTO) o;
        return migrationId == that.migrationId &&
                departureId == that.departureId &&
                arrivalId == that.arrivalId &&
                planeId == that.planeId &&
                placeNumber == that.placeNumber &&
                Objects.equals(departureDate, that.departureDate) &&
                Objects.equals(arrivalDate, that.arrivalDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(migrationId, departureId, departureDate, arrivalId, arrivalDate, planeId, placeNumber);
    }
}
