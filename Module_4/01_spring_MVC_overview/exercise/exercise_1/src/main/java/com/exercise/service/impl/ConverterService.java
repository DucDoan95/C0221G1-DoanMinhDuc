package com.exercise.service.impl;

import com.exercise.service.IConverterService;
import org.springframework.stereotype.Service;

@Service
public class ConverterService implements IConverterService {
    @Override
    public double converterUSD(double usd) {
        return usd*23000;
    }
}
