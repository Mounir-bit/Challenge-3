package com.example.test.dao;

import com.example.test.model.Customer;
import com.example.test.model.CustomerDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDetailDao extends MongoRepository<CustomerDetail,Integer> {

    @Override
    List<CustomerDetail> findAll();
}
