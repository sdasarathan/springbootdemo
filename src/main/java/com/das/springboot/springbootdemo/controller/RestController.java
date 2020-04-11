package com.das.springboot.springbootdemo.controller;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.dao.Person;
import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.FundRepository;
import com.das.springboot.springbootdemo.repository.PersonRepository;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
class RestController {

    private final PersonRepository personRepository;

    private final PortfolioRepository portfolioRepository;

    private final FundRepository fundRepository;

    RestController(PersonRepository personRepository, PortfolioRepository portfolioRepository, FundRepository fundRepository) {
        this.personRepository = personRepository;
        this.portfolioRepository = portfolioRepository;
        this.fundRepository = fundRepository;
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

    /**
     * Example rest call
     * curl localhost:8080/rest/portfolio
     * @return
     */
    @GetMapping("/portfolio")
    public List<Portfolio> listAllPortfolio() {
        return (List<Portfolio>) portfolioRepository.findAll();
    }

    /*
     * Example rest call
     * curl -X POST localhost:8080/rest/add/portfolio -H "Accept: application/json"
     * -H 'Content-type:application/json' -d '{"username":"abc"}'
     * */
    @PostMapping("/add/portfolio")
    public void addPortfolio(@RequestBody Portfolio portfolio){
        portfolioRepository.save(portfolio);
    }

    /**
     * Example rest call
     * curl localhost:8080/rest/fund
     * @return
     */
    @GetMapping("/fund")
    public List<Fund> listAllFund() {
        return (List<Fund>) fundRepository.findAll();
    }

    /*
     * Example rest call
     * curl -X POST localhost:8080/rest/add/fund -H "Accept: application/json"
     * -H 'Content-type:application/json' -d '{"fundName":"SBI", "fundType":"MutualFund"}'
     * */
    @PostMapping("/add/fund")
    public void addPortfolio(@RequestBody Fund fund){
        fundRepository.save(fund);
    }

}
