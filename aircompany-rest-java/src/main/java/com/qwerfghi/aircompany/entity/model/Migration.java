package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "migration", schema = "aircompany")
public class Migration {

    @Id
    @Column(name = "migration_id")
    private int migrationId;

    @OneToOne
    @JoinColumn(name = "departure_id", foreignKey = @ForeignKey(name = "migration_departure_fk"))
    @JsonIgnore
    private City departure;

    @Column(name = "departure_id", insertable = false, updatable = false)
    private Integer departureId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date")
    private Date departureDate;

    @OneToOne
    @JoinColumn(name = "arrival_id", foreignKey = @ForeignKey(name = "migration_arrival_fk"))
    @JsonIgnore
    private City arrival;

    @Column(name = "arrival_id", insertable = false, updatable = false)
    private Integer arrivalId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arrival_date")
    private Date arrivalDate;

    @OneToOne
    @JoinColumn(name = "plane_id", foreignKey = @ForeignKey(name = "migration_plane_fk"))
    @JsonIgnore
    private Plane plane;

    @Column(name = "plane_id", insertable = false, updatable = false)
    private Integer planeId;

    @Column(name = "cost")
    private Integer cost;
}
