package com.das.springboot.springbootdemo.controller;

import com.das.springboot.springbootdemo.dao.Person;
import com.das.springboot.springbootdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * Example rest call
     * curl localhost:8080/rest/persons
     * @return
     */
    @GetMapping("/persons")
    public List<Person> listAllPerson() {
        return personRepository.findAll();
    }

    /*
    * Example rest call
    * curl -X POST localhost:8080/rest/add -H "Accept: application/json"
    * -H 'Content-type:application/json' -d '{"firstName":"abc","lastName":"bbc"}'
    * */
    @PostMapping("/add")
    void addPerson(@RequestBody Person person){
        System.out.println("Request body: first name:" + person.getFirstName());
        personRepository.save(person);
    }

    /**
     * Example rest call for delete
     * curl -X DELETE localhost:8080/rest/delete/1
     *
     * @param id
     */
    @DeleteMapping("delete/{id}")
    public void deletePersonById(@PathVariable Long id){
        personRepository.deleteById(id);
    }
}
