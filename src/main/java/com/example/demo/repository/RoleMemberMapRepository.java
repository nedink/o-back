package com.example.demo.repository;

import com.example.demo.domain.RoleMemberMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleMemberMapRepository extends JpaRepository<RoleMemberMap, RoleMemberMap.Id> {
}
