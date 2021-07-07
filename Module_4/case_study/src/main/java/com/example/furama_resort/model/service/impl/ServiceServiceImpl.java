package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.Service;
import com.example.furama_resort.model.repository.IServiceRepository;
import com.example.furama_resort.model.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements IServiceService {
    @Autowired
    IServiceRepository iServiceRepository;

    @Override
    public Page<Service> findServiceByName(String name, Pageable pageable) {
        return iServiceRepository.findServiceByServiceNameContaining(name, pageable);
    }

    @Override
    public List<Service> findServiceByAll() {
        return (List<Service>) iServiceRepository.findAll();
    }

    @Override
    public Optional<Service> findServiceById(String id) {
        return iServiceRepository.findById(id);
    }

    @Override
    public void save(Service service) {
        iServiceRepository.save(service);
    }

}
