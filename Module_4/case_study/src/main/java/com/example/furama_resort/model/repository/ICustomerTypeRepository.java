package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends PagingAndSortingRepository<CustomerType,Integer> {
}
