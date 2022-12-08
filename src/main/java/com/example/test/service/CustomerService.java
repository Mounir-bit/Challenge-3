package com.example.test.service;

import com.example.test.dao.CustomerDAO;
import com.example.test.exception.CustomerNotFound;
import com.example.test.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class  CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
    public Customer addCustomer(Customer customer){
        return  customerDAO.save(customer);

    }

    public List <Customer> getCustomer(){
        return  customerDAO.findAll();
    }

    public Customer getCustomer(int customerId){

        Optional<Customer> optionalCustomer = customerDAO.findById((customerId));

        if (optionalCustomer.isEmpty())
            throw new CustomerNotFound("Customer record is not available");

        return optionalCustomer.get();

    }

    public Customer updateCustomer(int customerId, Customer customer ){
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }

    public void deleteCustomer(int customerId){
     customerDAO.deleteById(customerId);
    }
}
