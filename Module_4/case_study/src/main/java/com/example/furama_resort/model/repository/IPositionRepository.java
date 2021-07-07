package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.Position;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPositionRepository extends PagingAndSortingRepository<Position,Integer> {
}
