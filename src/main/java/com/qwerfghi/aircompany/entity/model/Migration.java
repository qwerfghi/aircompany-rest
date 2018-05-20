package com.qwerfghi.aircompany.entity.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "migration", schema = "aircompany")
public class Migration {
    private int migrationId;
    private City departure;
    private Date departureDate;
    private City arrival;
    private Date arrivalDate;
    private Plane plane;
    private Integer cost;

    @Id
    @Column(name = "migration_id")
    public int getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(int migrationId) {
        this.migrationId = migrationId;
    }

    @OneToOne
    @JoinColumn(name = "departure_id", foreignKey = @ForeignKey(name = "migration_departure_fk"))
    public City getDeparture() {
        return departure;
    }

    public void setDeparture(City departure) {
        this.departure = departure;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date")
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @OneToOne
    @JoinColumn(name = "arrival_id", foreignKey = @ForeignKey(name = "migration_arrival_fk"))
    public City getArrival() {
        return arrival;
    }

    public void setArrival(City arrival) {
        this.arrival = arrival;
    }

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arrival_date")
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @OneToOne
    @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "migration_plane_fk"))
    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
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
