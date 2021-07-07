package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.RentType;
import com.example.furama_resort.model.entity.ServiceType;

import java.util.List;

public interface IServiceTypeService {
    List<ServiceType> findServiceTypeByAll();
}
