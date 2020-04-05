package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class InitPortfolioData extends CommonCLR {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitPortfolioData.class);

    @Autowired
    private CrudRepository portfolioRepository;

    public void initData(CrudRepository repository) {
        Portfolio portfolio = new Portfolio();
        portfolio.setUsername("Das");
        ((PortfolioRepository) repository).save(portfolio);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("In Init Portfolio Data");
        initData(portfolioRepository);
    }
}
