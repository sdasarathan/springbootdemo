package com.das.springboot.springbootdemo.dao;

import javax.persistence.*;

@Entity
public class Fund {

    @Id
    @GeneratedValue()
    private Long id;

    @ManyToOne
    @JoinColumn(name = "investor_id", nullable = false)
    private Investor investor;

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

//    public Long getInvestorId() {
//        return investorId;
//    }
//
//    public void setInvestorId(Long investorId) {
//        this.investorId = investorId;
//    }
}
