package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import java.io.Serializable;

public class RoleCertificateMap implements Serializable {

    @EmbeddedId
    Id id;

    String requirement;

    public static class Id {
        Role role;
        CertificateType certificateType;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
}
