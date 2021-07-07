package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.CustomerType;
import com.example.furama_resort.model.entity.Division;

import java.util.List;

public interface IDivisionService {
    List<Division> findDivisionByAll();
}
