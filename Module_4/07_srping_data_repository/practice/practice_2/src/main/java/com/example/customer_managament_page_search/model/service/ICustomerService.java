package com.example.customer_managament_page_search.model.service;

import com.example.customer_managament_page_search.model.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findByAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
    Page<Customer> findByFistName(String name,Pageable pageable);
}
