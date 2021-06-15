package com.exercise.controller;


import com.exercise.service.ITranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TranslateController {
    @Autowired
    private ITranslateService translateService;

    @GetMapping(value = {"/", "/translate"})
    public String translate() {
        return "dictionary";
    }

    @PostMapping(value = "/translateVietnamese")
    public String translateVietnamese(@RequestParam String inputEnglish, Model model){
        String result = translateService.translateVietnamese(inputEnglish);
        model.addAttribute("resultVietnamese",result);
        return "dictionary";
    }

}
