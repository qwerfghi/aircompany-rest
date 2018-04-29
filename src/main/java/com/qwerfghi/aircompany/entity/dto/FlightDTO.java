package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "flight", schema = "aircompany")
public class FlightDTO {
    private int flightId;
    private int ticketId;
    private int migrationId;
    private int cost;
    private String clazz;

    @Id
    @Column(name = "flight_id")
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    @Basic
    @Column(name = "ticket_id")
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "migration_id")
    public int getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(int migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Column(name = "cost")
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDTO flightDTO = (FlightDTO) o;
        return flightId == flightDTO.flightId &&
                ticketId == flightDTO.ticketId &&
                migrationId == flightDTO.migrationId &&
                cost == flightDTO.cost &&
                Objects.equals(clazz, flightDTO.clazz);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightId, ticketId, migrationId, cost, clazz);
    }
}
