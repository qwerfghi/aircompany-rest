package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ticket", schema = "aircompany")
public class TicketDTO {
    private Integer ticketId;
    private Integer cost;
    private String clazz;
    private Integer placeNumber;
    private Integer passengerId;

    @Id
    @Column(name = "ticket_id")
    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
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

    @Basic
    @Column(name = "passenger_id")
    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketDTO ticketDTO = (TicketDTO) o;
        return Objects.equals(ticketId, ticketDTO.ticketId) &&
                Objects.equals(cost, ticketDTO.cost) &&
                Objects.equals(clazz, ticketDTO.clazz) &&
                Objects.equals(placeNumber, ticketDTO.placeNumber) &&
                Objects.equals(passengerId, ticketDTO.passengerId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ticketId, cost, clazz, placeNumber, passengerId);
    }
}
