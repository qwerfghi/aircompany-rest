package com.qwerfghi.aircompany.entity.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ticket", schema = "aircompany")
public class Ticket {
    private Integer ticketId;
    private int placeNumber;
    private int cost;
    private String clazz;
    private Passenger passenger;
    private Set<Migration> migrations;

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
    @Column(name = "place_number")
    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
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

    @ManyToOne
    @JoinColumn(name = "passenger_id", foreignKey = @ForeignKey(name = "ticket_passenger_fk"))
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @ManyToMany
    @JoinTable(name = "flight",
            joinColumns = @JoinColumn(name = "ticket_id", foreignKey = @ForeignKey(name = "flight_ticket_fk")),
            inverseJoinColumns = @JoinColumn(name = "migration_id", foreignKey = @ForeignKey(name = "flight_migration_fk")))
    public Set<Migration> getMigrations() {
        return migrations;
    }

    public void setMigrations(Set<Migration> migrations) {
        this.migrations = migrations;
    }
}