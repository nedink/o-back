package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    String id;
    Person sender;
    String category;
    String subject;
    ReceptionType receptionType;

    public enum ReceptionType {
        TO,
        CC,
        BCC
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ReceptionType getReceptionType() {
        return receptionType;
    }

    public void setReceptionType(ReceptionType receptionType) {
        this.receptionType = receptionType;
    }
}
