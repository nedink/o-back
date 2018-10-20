package com.example.demo.web;

import com.example.demo.domain.ComplianceStatus;
import com.example.demo.domain.Person;
import com.example.demo.domain.RequirementStatus;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private PersonRepository personRepository;

    @Autowired
    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;

        Person person = new Person("First", "Name", "birthday", "841456123", "city", "state", "87234", "123 daeihr St", RequirementStatus.OPTIONAL, ComplianceStatus.IN_COMPLIANCE);
        personRepository.save(person);
    }

    @GetMapping("/all")
    public ResponseEntity getAllPeople() {
        List<Person> people = personRepository.findAll();
        return new ResponseEntity(people, HttpStatus.OK);
    }
}
