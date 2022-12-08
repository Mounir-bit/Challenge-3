package com.example.test.dao;

import com.example.test.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends MongoRepository<Customer,Integer> {

    @Override
List<Customer> findAll();
}
