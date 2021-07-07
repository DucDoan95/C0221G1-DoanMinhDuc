package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.Division;
import com.example.furama_resort.model.repository.IDivisionRepository;
import com.example.furama_resort.model.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService {
    @Autowired
    IDivisionRepository iDivisionRepository;
    @Override
    public List<Division> findDivisionByAll() {
        return (List<Division>) iDivisionRepository.findAll();
    }
}
