package com.example.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Certificate implements Serializable {

    @EmbeddedId
    Id id;
    String dateAward;
    String dateExpire;

    @Embeddable
    public static class Id implements Serializable {
        CertificateType type;
        Person person;

        public CertificateType getType() {
            return type;
        }

        public void setType(CertificateType type) {
            this.type = type;
        }

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getDateAward() {
        return dateAward;
    }

    public void setDateAward(String dateAward) {
        this.dateAward = dateAward;
    }

    public String getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(String dateExpire) {
        this.dateExpire = dateExpire;
    }
}
