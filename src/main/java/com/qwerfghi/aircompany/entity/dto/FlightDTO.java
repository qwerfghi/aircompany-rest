package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "flight", schema = "aircompany")
public class FlightDTO {
    private Integer flightId;
    private Integer ticketId;
    private Integer migrationId;

    @Id
    @Column(name = "flight_id")
    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Basic
    @Column(name = "ticket_id")
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "migration_id")
    public Integer getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightDTO flightDTO = (FlightDTO) o;
        return Objects.equals(flightId, flightDTO.flightId) &&
                Objects.equals(ticketId, flightDTO.ticketId) &&
                Objects.equals(migrationId, flightDTO.migrationId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(flightId, ticketId, migrationId);
    }
}
