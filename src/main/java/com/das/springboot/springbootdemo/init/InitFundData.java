package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.FundRepository;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class InitFundData extends CommonCLR {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitFundData.class);

    @Autowired
    private CrudRepository fundRepository;

    public void initData(CrudRepository repository) {
        Fund fund = new Fund();
        fund.setFundName("SBI");
        fund.setFundType("MutualFund");
        ((FundRepository) repository).save(fund);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("In Init Fund Data");
        initData(fundRepository);
    }
}
