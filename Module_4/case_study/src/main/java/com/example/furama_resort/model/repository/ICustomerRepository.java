package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.Customer;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,String> {

//    @Query(value="select * from customer where customer_flag = 1 ",nativeQuery=true)
    Page<Customer> findCustomerByCustomerNameContainingAndCustomerFlagTrue(String name,Pageable pageable);

}
