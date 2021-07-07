package com.example.furama_resort.model.service;

import com.example.furama_resort.model.entity.CustomerType;
import com.example.furama_resort.model.entity.Position;

import java.util.List;

public interface IPositionService {
    List<Position> findPositionByAll();
}
