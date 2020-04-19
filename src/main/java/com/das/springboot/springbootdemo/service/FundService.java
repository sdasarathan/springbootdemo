package com.das.springboot.springbootdemo.service;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.repository.FundRepository;
import com.das.springboot.springbootdemo.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class FundService {

    @Autowired
    private InvestorRepository investorRepository;

    @Autowired
    private FundRepository fundRepository;

    public List<Fund> getAllFunds(){
        var fundIterable = fundRepository.findAll();

        var funds = new ArrayList<Fund>();
        fundIterable.forEach(funds::add);

        return funds;
    }

    public List<Fund> getFundByInvestor(String investorId){
        Long investorIdLong = Long.parseLong(investorId);
        return fundRepository.findByInvestor(investorRepository.findById(investorIdLong).get());
    }

    public void addFund(Fund fund){
        fundRepository.save(fund);
    }

    public void deleteFund(Fund fund){
        fundRepository.delete(fund);
    }
}
