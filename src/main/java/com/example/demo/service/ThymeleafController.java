package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.TemplateEngine;

import java.util.List;

public class ThymeleafController extends TemplateEngine {

    PersonRepository personRepository;

    @Autowired
    public ThymeleafController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/people")
    public String getPeople(Model model) {
        List<Person> people = personRepository.findAll();
        return "index";
    }
}
