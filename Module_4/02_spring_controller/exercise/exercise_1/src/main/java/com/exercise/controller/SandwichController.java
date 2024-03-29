package com.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @GetMapping(value = {"/", "/sandwichCondiment"})
    public String translate() {
        return "/sandwich";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        String result="";
        for(int i=0;i<condiment.length;i++){
            result+=condiment[i]+" ";
        }
        model.addAttribute("condiment","Sandwich include: "+result);
        return "/sandwich";
    }

}
