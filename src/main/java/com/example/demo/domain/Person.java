package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {

    @Id
    @GeneratedValue
    Long id;

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
    String primaryRole;

    RequirementStatus requirementStatus;
    ComplianceStatus complianceStatus;

    @ManyToMany
    Role role;

    public Person() {
    }

    public Person(String firstName, String lastName, String otherName, String birthdate, String cellPhone, String homePhone, String workPhone, String city, String state, String postalCode, String country, String streetAddress, RequirementStatus requirementStatus, ComplianceStatus complianceStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.birthdate = birthdate;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.streetAddress = streetAddress;
        this.requirementStatus = requirementStatus;
        this.complianceStatus = complianceStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate= birthdate;
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

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public RequirementStatus getRequirementStatus() {
        return requirementStatus;
    }

    public void setRequirementStatus(RequirementStatus requirementStatus) {
        this.requirementStatus = requirementStatus;
    }

    public ComplianceStatus getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(ComplianceStatus complianceStatus) {
        this.complianceStatus = complianceStatus;
    }
}
