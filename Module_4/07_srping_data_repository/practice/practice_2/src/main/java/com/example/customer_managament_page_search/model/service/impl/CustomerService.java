package com.example.customer_managament_page_search.model.service.impl;

import com.example.customer_managament_page_search.model.entity.Customer;
import com.example.customer_managament_page_search.model.repository.ICustomerRepository;
import com.example.customer_managament_page_search.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findByAll(Pageable pageable) {
        return  iCustomerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Long id) {
        return iCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findByFistName(String name,Pageable pageable) {
        return iCustomerRepository.findAllByFirstNameContaining(name,pageable);
    }
}
