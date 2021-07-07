package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.RentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentTypeRepository extends PagingAndSortingRepository<RentType,Integer> {
}
