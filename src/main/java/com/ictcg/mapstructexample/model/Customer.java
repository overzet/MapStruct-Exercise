package com.ictcg.mapstructexample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    @Id
    private Long id;
    private long customerId;
    private Title title;
    private String name;
    private Date lastLogin;


}
