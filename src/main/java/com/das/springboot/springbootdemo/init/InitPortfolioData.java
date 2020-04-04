package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class InitPortfolioData implements InitLoadData {
    @Override
    public void initData(CrudRepository repository) {
        Portfolio portfolio = new Portfolio();
        portfolio.setUsername("Das");
        ((PortfolioRepository) repository).save(portfolio);
    }
}
