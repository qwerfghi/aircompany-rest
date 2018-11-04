package com.qwerfghi.aircompany.entity.model;

import com.qwerfghi.aircompany.entity.enums.TicketClass;

import javax.persistence.*;

@Entity
@Table(name = "ticket", schema = "aircompany")
public class Ticket {
    private Integer ticketId;
    private Passenger passenger;
    private TicketClass clazz;
    private Boolean status;
    private Boolean baggageAvailable;
    private Boolean exchangeAvailable;
    private Boolean returnAvailable;
    private Migration migration;
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

    @ManyToOne
    @JoinColumn(name = "passenger_id", foreignKey = @ForeignKey(name = "ticket_passenger_fk"))
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "class")
    public TicketClass getClazz() {
        return clazz;
    }

    public void setClazz(TicketClass clazz) {
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

    @ManyToOne
    @JoinColumn(name = "migration_id", foreignKey = @ForeignKey(name = "ticket_migration_fk"))
    public Migration getMigration() {
        return migration;
    }

    public void setMigration(Migration migration) {
        this.migration = migration;
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