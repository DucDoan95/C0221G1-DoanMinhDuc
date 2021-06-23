package com.example.customer_province_management.model.repository;

import com.example.customer_province_management.model.entity.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
