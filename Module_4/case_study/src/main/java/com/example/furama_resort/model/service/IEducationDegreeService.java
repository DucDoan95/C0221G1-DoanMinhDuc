package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.CustomerType;
import com.example.furama_resort.model.entity.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> findEducationDegreeByAll();
}
