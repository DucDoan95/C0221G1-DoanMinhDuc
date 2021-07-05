package com.example.furama_resort.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping (value = "/header")
    public String showHome(){
        return "header";
    }
    @RequestMapping (value = "/footer")
    public String showfooter(){
        return "footer";
    }
    @RequestMapping (value = "/index")
    public String showindex(){
        return "index";
    }
}
