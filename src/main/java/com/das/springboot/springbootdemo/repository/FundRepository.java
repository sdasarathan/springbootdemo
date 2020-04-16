package com.das.springboot.springbootdemo.repository;

import com.das.springboot.springbootdemo.dao.Fund;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository()
public interface FundRepository extends CrudRepository<Fund, Long> {

    List<Fund> findByFundName(String fundName);

//    @Query("SELECT u FROM Fund u WHERE u.id = ?1")
//    List<Fund> fundsOfUser(Long userId);

    List<Fund> findByInvestorId(Long userId);

    Fund findById(long id);
}
