package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue
    UUID id;
    String firstName;
    String lastName;
    String otherName;
    String streetAddress;
    String city;
    String state;
    String postalCode;
    String country;
    String cellPhone;
    String homePhone;
    String workPhone;
    String birthdate;
    String emailAddress;
    String gender;
    Role primaryRole;

    public Person() {
    }

    public Person(String firstName, String lastName, String otherName, String streetAddress, String city, String state, String postalCode, String country, String cellPhone, String homePhone, String workPhone, String birthdate, String emailAddress, String gender, Role primaryRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.birthdate = birthdate;
        this.emailAddress = emailAddress;
        this.gender = gender;
        this.primaryRole = primaryRole;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
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

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Role getPrimaryRole() {
        return primaryRole;
    }

    public void setPrimaryRole(Role primaryRole) {
        this.primaryRole = primaryRole;
    }

    @Override
    public String toString() {
        return "Person{" +
               "id='" + id + '\'' +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", otherName='" + otherName + '\'' +
               ", streetAddress='" + streetAddress + '\'' +
               ", city='" + city + '\'' +
               ", state='" + state + '\'' +
               ", postalCode='" + postalCode + '\'' +
               ", country='" + country + '\'' +
               ", cellPhone='" + cellPhone + '\'' +
               ", homePhone='" + homePhone + '\'' +
               ", workPhone='" + workPhone + '\'' +
               ", birthdate='" + birthdate + '\'' +
               ", emailAddress='" + emailAddress + '\'' +
               ", gender='" + gender + '\'' +
               ", primaryRole=" + primaryRole +
               '}';
    }
}
