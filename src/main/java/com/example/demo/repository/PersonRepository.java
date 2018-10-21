package com.example.demo.repository;

import com.example.demo.domain.Person;
import com.example.demo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
    List<Person> findAllByFirstName(String firstName);
    Person findAllByPrimaryRole(Role role);
    void deleteById(UUID id);
}
