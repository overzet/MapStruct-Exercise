package com.ictcg.mapstructexample.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CustomerDTO implements Serializable {

    private long id;
    private String customerId;
    private String title;
    private String name;
    private String lastLogin;


}
