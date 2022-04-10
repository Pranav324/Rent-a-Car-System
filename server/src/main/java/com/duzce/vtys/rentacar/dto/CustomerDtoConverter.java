package com.duzce.vtys.rentacar.dto;

import com.duzce.vtys.rentacar.model.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerDtoConverter {

    public List<CustomerDto> convert(List<Customer> customers){
        return customers.stream().map(c -> new CustomerDto(c.getCustomerId(),c.getCustomerLoginId(),c.getFirstName(),c.getLastName(),c.getIdentityNumber())).collect(Collectors.toList());
    }

    public CustomerDto convert(Customer customer){
        return new CustomerDto(customer.getCustomerId(),customer.getCustomerLoginId(),customer.getFirstName(),customer.getLastName(),customer.getIdentityNumber());
    }
}