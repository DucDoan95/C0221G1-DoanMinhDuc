package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.Customer;
import com.example.furama_resort.model.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Page<Employee> findEmployeeByName(String name, Pageable pageable);
    List<Employee> findEmployeeByAll();
    Optional<Employee> findEmployeeById(Integer id);
    void save(Employee employee);
    void remove(Integer id);
}
