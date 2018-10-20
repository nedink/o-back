package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CertificateType implements Serializable {

    @Id
    String name;
    Integer yearsValid;
    @Column(columnDefinition = "text")
    String instuctions;

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

    public String getInstuctions() {
        return instuctions;
    }

    public void setInstuctions(String instuctions) {
        this.instuctions = instuctions;
    }
}
