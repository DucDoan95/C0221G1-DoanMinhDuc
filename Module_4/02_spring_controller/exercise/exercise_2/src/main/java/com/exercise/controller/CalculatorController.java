package com.exercise.controller;

import com.exercise.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @Autowired
    ICalculatorService iCalculatorService;

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
        String result = iCalculatorService.calculated(button,num1,num2);
        model.addAttribute("result",result);
        model.addAttribute("num1",num1);
        model.addAttribute("num2",num2);
        return "/calculator";
    }


}
