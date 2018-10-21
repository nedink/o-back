package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CertificateType implements Serializable {

    @Id
    String name;
    Integer yearsValid;
    @Column(columnDefinition = "text")
    String instructions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsValid() {
        return yearsValid;
    }

    public void setYearsValid(Integer yearsValid) {
        this.yearsValid = yearsValid;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
