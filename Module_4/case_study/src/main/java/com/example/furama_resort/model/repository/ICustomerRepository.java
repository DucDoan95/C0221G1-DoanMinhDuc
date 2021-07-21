package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.Customer;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer,String> {

    @Query(value="select * from customer where customer_flag = 1 && customer_name like %?1% && customer_id_card like %?2% && customer_phone like %?3%  ",nativeQuery=true)
    Page<Customer> findCustomerByCustomerNameContainingAndCustomerFlagTrue(String name,String idCard,String phone,Pageable pageable);
    List<Customer> findAllByCustomerFlagTrue();
}
