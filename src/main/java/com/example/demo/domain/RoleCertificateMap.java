package com.example.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class RoleCertificateMap implements Serializable {

    @EmbeddedId
    Id id;

    String requirement;

    @Embeddable
    public static class Id implements Serializable {
        @ManyToOne
        Role role;
        @ManyToOne
        CertificateType certificateType;

        public Role getRole() {
            return role;
        }

        public void setRole(Role role) {
            this.role = role;
        }

        public CertificateType getCertificateType() {
            return certificateType;
        }

        public void setCertificateType(CertificateType certificateType) {
            this.certificateType = certificateType;
        }
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
