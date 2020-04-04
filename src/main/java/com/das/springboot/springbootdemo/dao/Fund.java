package com.das.springboot.springbootdemo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fund {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(name = "fund_name")
    private String fundName;

    @Column(name = "fund_type")
    private String fundType;

    public Fund() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }
}
