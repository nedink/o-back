package com.example.demo.config;

import com.example.demo.domain.Message;
import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataPopulator implements CommandLineRunner {

    PersonService personService;

    @Autowired
    public DataPopulator(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void run(String... args) throws Exception {
        Person john = new Person("Sherlock", "Holmes", "Sherrinford", "221B Baker Street", "London", null, "NW1 6XE", "United Kingdom", null, null, null, "1/6/1854", "s.holmes@gmail.com", "M", null);
        john = personService.createPerson(john);
        Message message = new Message(john, null, null, null, "Hey how u?");
    }
}
