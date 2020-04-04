package com.das.springboot.springbootdemo.init;

import com.das.springboot.springbootdemo.dao.Portfolio;
import com.das.springboot.springbootdemo.repository.PortfolioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@FunctionalInterface
public interface InitLoadData {
    public void initData(CrudRepository repository);
}
