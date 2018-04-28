package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ticket", schema = "aircompany")
public class TicketDTO {
    private Integer ticketId;
    private Integer passengerId;
    private Integer flightId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    @Basic
    @Column(name = "passenger_id")
    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    @Basic
    @Column(name = "flight_id")
    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDTO ticketDTO = (TicketDTO) o;
        return Objects.equals(ticketId, ticketDTO.ticketId) &&
                Objects.equals(passengerId, ticketDTO.passengerId) &&
                Objects.equals(flightId, ticketDTO.flightId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ticketId, passengerId, flightId);
    }
}
