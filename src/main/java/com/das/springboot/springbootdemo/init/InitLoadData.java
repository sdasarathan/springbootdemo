package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.springframework.stereotype.Repository;

public interface InitLoadData {
    public void initData(PortfolioRepository repository);
}
