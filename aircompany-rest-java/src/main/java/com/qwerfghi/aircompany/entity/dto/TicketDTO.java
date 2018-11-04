package com.qwerfghi.aircompany.entity.dto;

import javax.persistence.*;

@Entity
@Table(name = "ticket", schema = "aircompany")
public class TicketDTO {
    private Integer ticketId;
    private Integer passengerId;
    private String clazz;
    private Boolean status;
    private Boolean baggageAvailable;
    private Boolean exchangeAvailable;
    private Boolean returnAvailable;
    private Integer migrationId;
    private Integer cost;

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
    @Column(name = "class")
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "status")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "baggage_available")
    public Boolean getBaggageAvailable() {
        return baggageAvailable;
    }

    public void setBaggageAvailable(Boolean baggageAvailable) {
        this.baggageAvailable = baggageAvailable;
    }

    @Basic
    @Column(name = "exchange_available")
    public Boolean getExchangeAvailable() {
        return exchangeAvailable;
    }

    public void setExchangeAvailable(Boolean exchangeAvailable) {
        this.exchangeAvailable = exchangeAvailable;
    }

    @Basic
    @Column(name = "return_available")
    public Boolean getReturnAvailable() {
        return returnAvailable;
    }

    public void setReturnAvailable(Boolean returnAvailable) {
        this.returnAvailable = returnAvailable;
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
    @Column(name = "migration_id")
    public Integer getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
    }

    @Basic
    @Column(name = "passenger_id")
    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }
}
