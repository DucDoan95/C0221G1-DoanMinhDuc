package com.example.customer_province_management.controller;

import com.example.customer_province_management.model.entity.Customer;
import com.example.customer_province_management.model.repository.IProvinceRepository;
import com.example.customer_province_management.model.service.ICustomerService;
import com.example.customer_province_management.model.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IProvinceService iProvinceService;
    @GetMapping("/list")
    public String showListCustomer(Model model) {
        model.addAttribute("customers", customerService.findByAll());
        return "/list";
    }


    @GetMapping("/create-customer")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("listProvince",iProvinceService.findByAll());
        return "/create";
    }

    @PostMapping("/create-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customer", new Customer());
        model.addAttribute("listProvince",iProvinceService.findByAll());
        model.addAttribute("message", "New customer created successfully");
        return "/create";
    }

    @GetMapping("/edit-customer/{id}")
    public String showEditForm(@PathVariable Long id,Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("listProvince",iProvinceService.findByAll());
            model.addAttribute("customer", customer);
            return "/edit";

        } else {
            return "/error.404";
        }
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer,Model model) {
        customerService.save(customer);
        model.addAttribute("customer", customer);
        model.addAttribute("message", "Customer updated successfully");
        return "/edit";
    }


    @GetMapping("/delete-customer/{id}")
    public String showDeleteForm(@PathVariable Long id,Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "/delete";

        } else {
            return "/error.404";
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer,Model model) {
        customerService.remove(customer.getId());
        model.addAttribute("message", "Customer delete successfully");
        return "/delete";
    }

}