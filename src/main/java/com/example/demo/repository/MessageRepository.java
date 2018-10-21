package com.example.demo.repository;

import com.example.demo.domain.Message;
import com.example.demo.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {
    List<Message> findAllBySender(Person person);
    Page<Message> findAllBySenderOrderByDateDesc(Person person, Pageable pageable);
}
