package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.EducationDegree;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationDegreeRepository extends PagingAndSortingRepository<EducationDegree,Integer> {
}
