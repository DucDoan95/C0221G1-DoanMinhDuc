package com.example.furama_resort.model.repository;

import com.example.furama_resort.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    Page<Employee> findEmployeeByEmployeeNameContainingAndEmployeeFlagTrue(String name, Pageable pageable);
    List<Employee> findAllByEmployeeFlagTrue();
}
