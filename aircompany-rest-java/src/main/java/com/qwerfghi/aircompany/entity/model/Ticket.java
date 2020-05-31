package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.TicketClass;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ticket", schema = "aircompany")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Integer ticketId;

    @ManyToOne
    @JoinColumn(name = "passenger_id", foreignKey = @ForeignKey(name = "ticket_passenger_fk"))
    private Passenger passenger;

    @Column(name = "passenger_id", insertable = false, updatable = false)
    private Integer passengerId;

    @Enumerated(EnumType.STRING)
    @Column(name = "class")
    private TicketClass clazz;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "baggage_available")
    private Boolean baggageAvailable;

    @Column(name = "exchange_available")
    private Boolean exchangeAvailable;

    @Column(name = "return_available")
    private Boolean returnAvailable;

    @ManyToOne
    @JoinColumn(name = "migration_id", foreignKey = @ForeignKey(name = "ticket_migration_fk"))
    @JsonIgnore
    private Migration migration;

    @Column(name = "migration_id", insertable = false, updatable = false)
    private Integer migrationId;

    @Column(name = "cost")
    private Integer cost;
}
