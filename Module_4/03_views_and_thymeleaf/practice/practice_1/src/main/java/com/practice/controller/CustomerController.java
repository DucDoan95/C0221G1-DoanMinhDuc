package com.practice.controller;

import com.practice.model.bean.Customer;
import com.practice.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping(value = "")
    public String index(Model model){
        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customers",customerList);
        return "/index";
    }

    @GetMapping(value = "/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "/create";
    }
    @PostMapping(value = "/save")
    public String save(Customer customer , RedirectAttributes redirectAttributes){
        customer.setId((int) (Math.random() * 10000));
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Create successfully");
        return "redirect:/customer";
    }


    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("customer", iCustomerService.findById(id));
        return "/edit";
    }
    @PostMapping(value = "/update")
    public String update(Customer customer){
        iCustomerService.update(customer.getId(),customer);
        return "redirect:/customer";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        return "/delete";
    }
    @PostMapping(value = "/delete")
    public String delete(Customer customer, RedirectAttributes redirectAttributes){
        iCustomerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("success","delete customer successfully");
        return "redirect:/customer";
    }

    @GetMapping(value = "/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        return "/view";
    }
}
