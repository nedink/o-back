package com.example.demo.repository;

import com.example.demo.domain.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Membership.Id> {
}
