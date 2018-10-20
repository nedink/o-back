package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import java.io.Serializable;

public class PersonMessageMap implements Serializable {

    @EmbeddedId
    Id id;

    ReceiverType receiverType;

    public static class Id {
        Person person;
        Message message;
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
