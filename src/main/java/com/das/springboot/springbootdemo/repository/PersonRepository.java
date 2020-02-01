package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
