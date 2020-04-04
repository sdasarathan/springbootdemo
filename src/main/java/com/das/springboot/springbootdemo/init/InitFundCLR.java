package com.das.springboot.springbootdemo.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class InitFundCLR implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitLoadData.class);

    @Autowired
    private CrudRepository fundRepository;

    @Autowired
    private InitFundData initFundData;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("In InitFundCLR");
        initFundData.initData( fundRepository);
    }

}
