package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.CustomerType;
import com.example.furama_resort.model.entity.RentType;

import java.util.List;

public interface IRentTypeService {
    List<RentType> findRentTypeByAll();
}
