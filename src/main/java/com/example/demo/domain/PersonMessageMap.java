package com.example.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

public class PersonMessageMap implements Serializable {

    @EmbeddedId
    Id id;

    ReceiverType receiverType;

    @Embeddable
    public static class Id implements Serializable {
        Person person;
        Message message;

        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        public Message getMessage() {
            return message;
        }

        public void setMessage(Message message) {
            this.message = message;
        }
    }

    public enum ReceiverType {
        TO,
        CC,
        BCC
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public ReceiverType getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(ReceiverType receiverType) {
        this.receiverType = receiverType;
    }
}
