package com.example.libary_management.controller;

import com.example.libary_management.model.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    IBookService iBookService;
    @GetMapping
    public String showHomePage(@PageableDefault(size = 5) Pageable page, Model model){
        model.addAttribute("listBook",iBookService.findAll(page));
        return "home";
    }
}
