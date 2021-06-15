package com.exercise.controller;

import com.exercise.service.IConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {

    @Autowired
    private IConverterService converterService;

    @GetMapping(value = {"/","/converter"})
    public String converter(){
        return "converter";
    }

    @PostMapping(value = "/converterUSD")
    public String converterUSD(@RequestParam String inputUSD, Model model){
        double usd = Double.parseDouble(inputUSD);
        model.addAttribute("converterResult",converterService.converterUSD(usd) +" VND");
        model.addAttribute("usd",usd);
        return "converter";
    }
}
