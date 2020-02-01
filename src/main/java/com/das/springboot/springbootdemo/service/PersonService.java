package com.das.springboot.springbootdemo.service;

import com.das.springboot.springbootdemo.dao.Person;
import com.das.springboot.springbootdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> list() {
     return personRepository.findAll();
    }
}
