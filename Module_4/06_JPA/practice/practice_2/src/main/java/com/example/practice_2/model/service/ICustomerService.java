package com.example.practice_2.model.service;

import com.example.practice_2.model.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);

}
