package com.example.customer_management.model.service.impl;

import com.example.customer_management.model.entity.Customer;
import com.example.customer_management.model.repository.ICustomerRepository;
import com.example.customer_management.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findByAll(Pageable pageable)   {
        return  iCustomerRepository.findAll(pageable);
    }

    @Override
    public Optional<Customer> findById(Long id) throws Exception {
        Optional<Customer> customerOptional = iCustomerRepository.findById(id);
        if (!customerOptional.isPresent()) {
            throw new Exception("customer not found!");
        }
        return customerOptional;
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
    public Page<Customer> findByFistName(String name, Pageable pageable) {
        return iCustomerRepository.findAllByFirstNameContaining(name,pageable);
    }
}
