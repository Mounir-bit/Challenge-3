package com.example.test.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigInteger;

@Getter
@Setter
@Document(collection = "customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;
    @Column
    private int customerId ;
    private String customerFirstName ;
    private String customerLastName ;
    private String customerEmail ;

    private  String createdAt ;

    private  String updatedAt ;
    public Customer(int CustomerId, String firstName, String lastName, String mail, String created, String updated) {

        this.customerId = CustomerId;
        this.customerFirstName = firstName;
        this.customerLastName = lastName;
        this.customerEmail = mail;
        this.createdAt = created;
        this.updatedAt = updated;
    }
    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "customerDetail")
    private CustomerDetail Detail;

}
