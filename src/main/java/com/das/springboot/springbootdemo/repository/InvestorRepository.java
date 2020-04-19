package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.dao.Investor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface InvestorRepository extends CrudRepository<Investor, Long> {

    Investor findById(long id);

    List<Investor> findByFund(Fund fund);
}
