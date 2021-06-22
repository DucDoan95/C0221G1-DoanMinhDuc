package com.example.practice1.model.service;

import com.example.practice1.model.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findByAll();
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
}
