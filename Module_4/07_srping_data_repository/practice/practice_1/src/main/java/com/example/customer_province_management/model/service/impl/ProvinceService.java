package com.example.customer_province_management.model.service.impl;

import com.example.customer_province_management.model.entity.Province;
import com.example.customer_province_management.model.repository.IProvinceRepository;
import com.example.customer_province_management.model.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService implements IProvinceService {
    @Autowired
    IProvinceRepository iProvinceRepository;
    @Override
    public List<Province> findByAll() {
        return (List<Province>) iProvinceRepository.findAll();
    }
}
