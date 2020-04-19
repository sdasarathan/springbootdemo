package com.das.springboot.springbootdemo.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Investor {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(targetEntity = Fund.class)
    private List investedFund;

    public Investor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List getInvestedFund() {
        return investedFund;
    }

    public void setInvestedFund(List investedFund) {
        this.investedFund = investedFund;
    }
}
