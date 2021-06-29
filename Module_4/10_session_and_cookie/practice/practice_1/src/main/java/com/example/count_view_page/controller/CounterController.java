package com.example.count_view_page.controller;

import com.example.count_view_page.model.entity.Counter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("counter")
public class CounterController {
    @ModelAttribute("counter")
    public Counter setUpCounter(){
        return new Counter();
    }

    @GetMapping(value = "/")
    public String get(@ModelAttribute("counter") Counter counter){
        counter.increment();
        return "index";
    }
}
