package com.example.demo.repository;

import com.example.demo.domain.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Certificate.Id> {
}
