package com.example.test.service;
import com.example.test.dao.CustomerDetailDao;
import com.example.test.exception.CustomerNotFound;
import com.example.test.model.CustomerDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class CustomerServiceDetail {

    @Autowired
    private CustomerDetailDao customerDetailDao;
    public CustomerDetail addCustomerDetail(CustomerDetail customerDetail){
        return  customerDetailDao.save(customerDetail);

    }

    public List <CustomerDetail> getCustomerDetail(){
        return  customerDetailDao.findAll();
    }

    public CustomerDetail getCustomerDetail(int customerDetailId){

        Optional<CustomerDetail> optionalCustomerDetail = customerDetailDao.findById((customerDetailId));

        if (optionalCustomerDetail.isEmpty())
            throw new CustomerNotFound("Customer record is not available");

        return optionalCustomerDetail.get();

    }

    public void deleteCustomerDetail(int customerDetailId){
     customerDetailDao.deleteById(customerDetailId);
    }

    public CustomerDetail updateCustomerDetail(int CustomerDetailId, CustomerDetail customerDetail ){
        customerDetail.setCustomerDetailId(CustomerDetailId);
        return customerDetailDao.save(customerDetail);
    }
}
