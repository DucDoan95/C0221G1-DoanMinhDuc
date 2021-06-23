package com.example.customer_province_management.model.service;

import com.example.customer_province_management.model.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findByAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
