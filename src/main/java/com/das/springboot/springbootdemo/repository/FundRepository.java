package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Fund;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository()
public interface FundRepository extends CrudRepository<Fund, Long> {

    List<Fund> findByFundName(String fundName);

    Fund findById(long id);
}
