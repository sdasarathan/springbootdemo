package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.FundRepository;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class InitFundData implements InitLoadData {
    @Override
    public void initData(CrudRepository repository) {
        Fund fund = new Fund();
        fund.setFundName("SBI");
        fund.setFundType("MutualFund");
        ((FundRepository) repository).save(fund);
    }
}
