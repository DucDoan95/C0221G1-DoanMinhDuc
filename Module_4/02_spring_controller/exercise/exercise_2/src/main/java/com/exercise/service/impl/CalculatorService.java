package com.exercise.service.impl;

import com.exercise.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public String calculated(String operator, float num1, float num2) {
        Float result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                return "Result Addition: " + result;
            case "-":
                result = num1 - num2;
                return "Result Subtraction: " + result;
            case "*":
                result = num1 * num2;
                return "Result Multiplication: " + result;
            case "/":
                if (num2 == 0) {
                    return "Cannot divide by zero";
                } else {
                    result = num1 / num2;
                    return "Result Division: " + result;
                }
            default:
                return "Error";
        }
    }
}
