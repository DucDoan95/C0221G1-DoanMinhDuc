package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.ServiceType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceTypeRepository extends PagingAndSortingRepository<ServiceType,Integer> {
}
