package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Fund;
import com.das.springboot.springbootdemo.dao.Investor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface FundRepository extends CrudRepository<Fund, Long> {

    List<Fund> findByFundName(String fundName);

    List<Fund> findByInvestorId(Long userId);

    List<Fund> findByInvestor(Investor investor);

    Fund findById(long id);
}
