package com.example.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Membership implements Serializable {

    @EmbeddedId
    Id id;

    String startDate;
    String expirationDate;
    String category;
    String dateSynced;

    @Embeddable
    public static class Id implements Serializable {
        Person person;
        Organization organization;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDateSynced() {
        return dateSynced;
    }

    public void setDateSynced(String dateSynced) {
        this.dateSynced = dateSynced;
    }
}
