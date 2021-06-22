package com.example.practice_2.model.repository;

import com.example.practice_2.model.entity.Customer;
import org.springframework.stereotype.Repository;


public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}
