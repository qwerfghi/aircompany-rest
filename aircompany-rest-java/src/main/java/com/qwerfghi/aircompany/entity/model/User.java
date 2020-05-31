package com.qwerfghi.aircompany.entity.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.qwerfghi.aircompany.entity.enums.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "aircompany")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "user_person_fk"))
    @JsonIgnore
    private Person person;

    @Column(name = "person_id", insertable = false, updatable = false)
    private Integer personId;
}
