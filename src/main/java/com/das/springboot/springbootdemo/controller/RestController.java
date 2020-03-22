package com.das.springboot.springbootdemo.controller;

import com.das.springboot.springbootdemo.dao.Person;
import com.das.springboot.springbootdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
class RestController {

    private final PersonRepository personRepository;

    RestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/status")
    public String firstPage() {
        return "{\"status\": \"up\"}";
    }

    @GetMapping("/persons")
    public List<Person> listAllPerson() {
       return personRepository.findAll();
    }

    @PostMapping("/add/{personName}")
    void addPerson(@PathVariable String personName){
        Person person = new Person();
        person.setFirstName(personName);
        person.setLastName("abc");
        personRepository.save(person);
    }
}
