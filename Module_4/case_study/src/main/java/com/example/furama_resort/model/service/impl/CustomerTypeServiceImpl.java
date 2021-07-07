package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.CustomerType;
import com.example.furama_resort.model.repository.ICustomerTypeRepository;
import com.example.furama_resort.model.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> findCustomerTypeByAll() {
        return (List<CustomerType>) iCustomerTypeRepository.findAll();
    }
}
