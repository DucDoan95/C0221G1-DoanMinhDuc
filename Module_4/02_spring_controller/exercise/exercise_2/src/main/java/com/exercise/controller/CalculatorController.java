package com.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping(value = {"/","/calculator"})
    public String calculator(){
        return "/calculator";
    }

    @PostMapping(value = "/calculatorNumber")
    public String calculatorNumber(@RequestParam String inputNumber1,
                                   @RequestParam String inputNumber2,
                                   @RequestParam String button,
                                   Model model){
        float num1 = Float.parseFloat(inputNumber1);
        float num2= Float.parseFloat(inputNumber2);
        Float result ;
        if(button.equals("+")){
            result=num1+num2;
            model.addAttribute("result","Result Addition: "+result);
        }
        if(button.equals("-")){
            result=num1-num2;
            model.addAttribute("result","Result Subtraction: "+result);
        }
        if(button.equals("*")){
            result=num1*num2;
            model.addAttribute("result","Result Multiplication: "+result);
        }
        if(button.equals("/")){
            if(num2==0){
                model.addAttribute("result","Cannot divide by zero");

            }else {
                result=num1/num2;
                model.addAttribute("result","Result Division: "+result);
            }
        }
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "/calculator";
    }


}
