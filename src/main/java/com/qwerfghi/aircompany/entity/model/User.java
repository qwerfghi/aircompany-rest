package com.qwerfghi.aircompany.entity.model;

import com.qwerfghi.aircompany.entity.enums.UserRole;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "aircompany")
public class User {
    private Integer userId;
    private String username;
    private String password;
    private UserRole userRole;
    private Person person;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(name = "user_person_fk"))
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
