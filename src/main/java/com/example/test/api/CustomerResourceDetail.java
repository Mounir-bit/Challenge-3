package com.example.test.api;


import com.example.test.model.Customer;
import com.example.test.model.CustomerDetail;
import com.example.test.service.CustomerServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value  ="/customersDetail")
public class CustomerResourceDetail {

    @Autowired
    private CustomerServiceDetail customerServiceDetail ;

    @PostMapping
    public CustomerDetail addCustomerDetail(@RequestBody CustomerDetail customerDetail){

        return customerServiceDetail.addCustomerDetail(customerDetail);
    }
    @GetMapping
    public List<CustomerDetail> getCustomersDetail(){
        return customerServiceDetail.getCustomerDetail();
    }
    @GetMapping(value = "/{customerDetailId}")
    public CustomerDetail getCustomerDetail(@PathVariable("customerDetailId") int customerDetailId){
        return customerServiceDetail.getCustomerDetail(customerDetailId);
    }

    @PutMapping(value = "/{customerDetailId}")
    public CustomerDetail updateCustomerDetail(@PathVariable("customerDetailId") int customerDetailId, @RequestBody CustomerDetail customerDetail){
        return customerServiceDetail.updateCustomerDetail(customerDetailId, customerDetail);
    }

    @DeleteMapping(value = "/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId){
        customerServiceDetail.deleteCustomerDetail(customerId);
    }
}
