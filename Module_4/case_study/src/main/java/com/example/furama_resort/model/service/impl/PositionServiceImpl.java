package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.Position;
import com.example.furama_resort.model.repository.IPositionRepository;
import com.example.furama_resort.model.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    IPositionRepository iPositionRepository;
    @Override
    public List<Position> findPositionByAll() {
        return (List<Position>) iPositionRepository.findAll();
    }
}
