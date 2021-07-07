package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.RentType;
import com.example.furama_resort.model.repository.IRentTypeRepository;
import com.example.furama_resort.model.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    IRentTypeRepository iRentTypeRepository;
    @Override
    public List<RentType> findRentTypeByAll() {
        return (List<RentType>) iRentTypeRepository.findAll();
    }
}
