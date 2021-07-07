package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.ContractDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContractDetailRepository extends PagingAndSortingRepository<ContractDetail,Integer> {
}
