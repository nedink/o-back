package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class SafeSportAccountRequest implements Serializable {

    @Id
    String id;
    Person requestee;
    Date dateSubmitted;
    @Column(columnDefinition = "decimal(12,2)")
    Double cost;
    Boolean paid;
    String status;
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
    String localClub;
    String state;
    String postalCode;
    String country;
    @ManyToMany
    List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getRequestee() {
        return requestee;
    }

    public void setRequestee(Person requestee) {
        this.requestee = requestee;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getOusaMember() {
        return ousaMember;
    }

    public void setOusaMember(Boolean ousaMember) {
        this.ousaMember = ousaMember;
    }

    public String getOusaNumber() {
        return ousaNumber;
    }

    public void setOusaNumber(String ousaNumber) {
        this.ousaNumber = ousaNumber;
    }

    public String getLocalClub() {
        return localClub;
    }

    public void setLocalClub(String localClub) {
        this.localClub = localClub;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
