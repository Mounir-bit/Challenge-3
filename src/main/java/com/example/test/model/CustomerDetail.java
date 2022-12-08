package com.example.test.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.math.BigInteger;

@Getter
@Setter
@Document(collection = "customerDetail")
public class CustomerDetail {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "customerDetailId")
   private BigInteger DetailId ;
   @Column
   private int customerDetailId ;
   private  String githubprofilelink;
   private  String linkedprofilelink;
   private  String CreatedAt;
   private String UpdatedAt;
   public CustomerDetail(int customerDetailId, String Githubprofilelink, String Linkedprofilelink, String CreatedAt, String UpdatedAt) {

        this.customerDetailId = customerDetailId;
        this.githubprofilelink = Githubprofilelink;
        this.linkedprofilelink = Linkedprofilelink;
        this.CreatedAt = CreatedAt;
        this.UpdatedAt = UpdatedAt;
    }
    @Column(nullable = false)
    private String cusTomer;

    @OneToOne(mappedBy = "Detail")
    private Customer customer;
}
