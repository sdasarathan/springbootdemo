package com.das.springboot.springbootdemo.service;

import com.das.springboot.springbootdemo.dao.Investor;
import com.das.springboot.springbootdemo.repository.FundRepository;
import com.das.springboot.springbootdemo.repository.InvestorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestorService {

    private InvestorRepository investorRepository;

    private FundRepository fundRepository;

    public InvestorService(InvestorRepository investorRepository, FundRepository fundRepository) {
        this.investorRepository = investorRepository;
        this.fundRepository = fundRepository;
    }

    public List<Investor> getAllInvestors(){
        var investorsIterable = investorRepository.findAll();

        var investors = new ArrayList<Investor>();
        investorsIterable.forEach(investors::add);

        return investors;
    }

    public List<Investor> getInvestorByFund(@RequestBody String fundId){
        Long fundIdLong = Long.parseLong(fundId);
        return investorRepository.findByInvestedFund(fundRepository.findById(fundIdLong).get());
    }

    public void addInvestor(Investor investor){
        investorRepository.save(investor);
    }

    public void deleteInvestor(Investor investor){
        investorRepository.delete(investor);
    }
}
