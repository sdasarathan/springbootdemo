package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Portfolio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PortfolioRepository extends CrudRepository<Portfolio, Long> {

    List<Portfolio> findByUsername(String username);

    Portfolio findById(long id);
}
