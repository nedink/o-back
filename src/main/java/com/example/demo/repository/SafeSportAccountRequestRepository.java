package com.example.demo.repository;

import com.example.demo.domain.SafeSportAccountRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SafeSportAccountRequestRepository extends JpaRepository<SafeSportAccountRequest, UUID> {
}
