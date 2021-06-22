package com.example.practice_2.controller;


import com.example.practice_2.model.entity.Customer;
import com.example.practice_2.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping(value = "/create")
    public String saveCustomer(@ModelAttribute("customer") Customer customer,Model model) {
        customerService.insertWithStoredProcedure(customer);
        model.addAttribute("customer", new Customer());
        model.addAttribute("message", "New customer created successfully");
        return "create";
    }

}