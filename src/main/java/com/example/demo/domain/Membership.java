package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Membership {

    @Id
    String id;
    Organization organization;
    Person member;
    String startDate;
    String expirationDate;
    String category;
    String dateSynced;

}
