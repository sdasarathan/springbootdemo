package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.SpringBootApplication;
import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Component
public class InitPortfolioCLR implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitLoadData.class);

    @Autowired
    private CrudRepository portfolioRepository;

    @Autowired
    private InitPortfolioData initPortfolioData;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("In InitPortfolioCLR");
        initPortfolioData.initData( portfolioRepository);
    }

}
