package com.example.demo.domain;

import javax.persistence.Entity;

@Entity
public class Certificate {

    CertificationType type;
    String dateAward;
    String dateExpire;
}
