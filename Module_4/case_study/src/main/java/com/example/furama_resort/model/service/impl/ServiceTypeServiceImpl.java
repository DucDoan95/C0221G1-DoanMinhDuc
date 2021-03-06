package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.ServiceType;
import com.example.furama_resort.model.repository.IServiceTypeRepository;
import com.example.furama_resort.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements IServiceTypeService {
    @Autowired
    IServiceTypeRepository iServiceTypeRepository;
    @Override
    public List<ServiceType> findServiceTypeByAll() {
        return (List<ServiceType>) iServiceTypeRepository.findAll();
    }
}
