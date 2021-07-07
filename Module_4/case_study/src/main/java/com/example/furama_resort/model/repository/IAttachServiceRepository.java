package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.Attach_Service;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttachServiceRepository extends PagingAndSortingRepository<Attach_Service,Integer> {
}
