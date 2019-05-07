package com.ictcg.mapstructexample.mapper;

import com.ictcg.mapstructexample.dto.CustomerDTO;
import com.ictcg.mapstructexample.model.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    //@Mapping(target = "ID", source = "id")
    CustomerDTO customer2DTO(Customer customer);
}
