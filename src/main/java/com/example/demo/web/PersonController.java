package com.example.demo.web;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity getAll() {
        List<Person> result = personService.findAll();
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @GetMapping(params = "firstName")
    public ResponseEntity getByFirstName(@RequestParam String firstName) {
        List<Person> result = personService.getAllByFirstName(firstName);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createPerson(@RequestBody Person person) {
        Person result = personService.createPerson(person);
        return new ResponseEntity(person, HttpStatus.CREATED);
    }
}
