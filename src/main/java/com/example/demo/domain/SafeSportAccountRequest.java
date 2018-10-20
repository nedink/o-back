package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.List;

@Entity
public class SafeSportAccountRequest {

    @Id
    String id;

    Person requestee;

    Date dateSubmitted;

    @Column(columnDefinition = "decimal(12,2)")
    Double cost;

    Boolean paid;

    @Column(columnDefinition = "varchar(20)")
    String status;

    @Column(columnDefinition = "varchar(50)")
    String emailAddress;
    String firstName;
    String lastName;
    String preferredName;
    String streetAddress;
    String city;
    String birthdate;
    String gender;
    Boolean ousaMember;
    String ousaNumber;
    String state;
    String postalCode;
    String country;

    List<Role> roles;
}
