package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "migration", schema = "aircompany")
public class MigrationDTO {
    private Integer migrationId;
    private Integer departureId;
    private Date departureDate;
    private Integer arrivalId;
    private Date arrivalDate;
    private Integer planeId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MigrationDTO that = (MigrationDTO) o;
        return Objects.equals(migrationId, that.migrationId) &&
                Objects.equals(departureId, that.departureId) &&
                Objects.equals(departureDate, that.departureDate) &&
                Objects.equals(arrivalId, that.arrivalId) &&
                Objects.equals(arrivalDate, that.arrivalDate) &&
                Objects.equals(planeId, that.planeId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(migrationId, departureId, departureDate, arrivalId, arrivalDate, planeId);
    }
}
