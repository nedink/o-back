package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    PersonRepository personRepository;

    Logger logger = LoggerFactory.getLogger(PersonService.class);

    @Autowired
    PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person getById(UUID id) {
        Person person = personRepository.findById(id).get();
        logger.info("Found person with id: {}", id);
        return person;
    }

    public List<Person> getAllByFirstName(String firstName) {
        List<Person> person = personRepository.findAllByFirstName(firstName);
        logger.info("Found person with first name: {}", firstName);
        return person;
    }

    public Person createPerson(Person person) {
        Person result = personRepository.save(person);
        logger.info("Created person");
        return result;
    }

    public void deleteById(UUID id) {
        personRepository.deleteById(id);
    }
}
