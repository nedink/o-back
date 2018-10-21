package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class Role implements Serializable {

    @Id
    String name;
    String description;
    RequirementStatus requirementStatus;
    ComplianceStatus complianceStatus;
    Boolean isSafeSportRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Boolean getSafeSportRole() {
        return isSafeSportRole;
    }

    public void setSafeSportRole(Boolean safeSportRole) {
        isSafeSportRole = safeSportRole;
    }

}
