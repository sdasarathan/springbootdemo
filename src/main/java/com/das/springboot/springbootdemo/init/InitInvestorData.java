package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Investor;
import com.das.springboot.springbootdemo.repository.InvestorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component("InvestorData")
@DependsOn("FundData")
public class InitInvestorData extends CommonCLR {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitInvestorData.class);

    @Autowired
    private CrudRepository investorRepository;

    public void initData(CrudRepository repository) {
        Investor investor = new Investor();
        investor.setId(1L);
        investor.setFirstName("Dasarathan");
        investor.setLastName("Selvaraj");
        ((InvestorRepository) repository).save(investor);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("In Init Investor Data");
        initData(investorRepository);
    }
}
