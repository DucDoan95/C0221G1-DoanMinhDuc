package com.example.phone_management.model.repository;

import com.example.phone_management.model.entity.Smartphone;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends PagingAndSortingRepository<Smartphone,Long> {
}
