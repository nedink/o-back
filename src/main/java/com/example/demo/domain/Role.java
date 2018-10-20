package com.example.demo.domain;

import javax.persistence.Entity;

@Entity
public class Role {

    String name;
    String description;
    Double safesportCost;
    RequirementStatus requirementStatus;
    ComplianceStatus complianceStatus;

    public Role() {
    }

    public Role(String name, String description, Double safesportCost, RequirementStatus requirementStatus, ComplianceStatus complianceStatus) {
        this.name = name;
        this.description = description;
        this.safesportCost = safesportCost;
        this.requirementStatus = requirementStatus;
        this.complianceStatus = complianceStatus;
    }

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

    public Double getSafesportCost() {
        return safesportCost;
    }

    public void setSafesportCost(Double safesportCost) {
        this.safesportCost = safesportCost;
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
