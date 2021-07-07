package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.EducationDegree;
import com.example.furama_resort.model.repository.IEducationDegreeRepository;
import com.example.furama_resort.model.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService {
    @Autowired
    IEducationDegreeRepository iEducationDegreeRepository;
    @Override
    public List<EducationDegree> findEducationDegreeByAll() {
        return (List<EducationDegree>) iEducationDegreeRepository.findAll();
    }
}
