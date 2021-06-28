package com.example.customer_management.controller;

import com.example.customer_management.exception.CustomerException;
import com.example.customer_management.model.entity.Customer;
import com.example.customer_management.model.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public String showCreateForm(Model model) {

        model.addAttribute("customer", new Customer());
        return "/create";
    }

    @PostMapping("/create-customer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customer", new Customer());
        model.addAttribute("message", "New customer created successfully");
        return "/create";
    }

    @GetMapping("/edit-customer/{id}")
    public String showEditForm(@PathVariable Long id, Model model) throws CustomerException {

        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        if (customer == null) {
            throw new CustomerException();
        }
        return "/edit";


    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customer", customer);
        model.addAttribute("message", "Customer updated successfully");
        return "/edit";
    }


    @GetMapping("/delete-customer/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) throws CustomerException {
        Customer customer = customerService.findById(id);
        model.addAttribute("customer", customer);
        if (customer ==null) {
            throw new CustomerException();
        }
        return "/delete";

    }


    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        customerService.remove(customer.getId());
        model.addAttribute("message", "Customer delete successfully");
        return "/delete";
    }

    @GetMapping("/list")
    public String searchFirstName(@RequestParam(name = "search") Optional<String> search, @PageableDefault(size = 1) Pageable page, Model model) {
        Page<Customer> customers;
        if (search.isPresent()) {
            customers = customerService.findByFistName(search.get(), page);
            model.addAttribute("search", search.get());
        } else {
            customers = customerService.findByAll(page);
        }
        model.addAttribute("customers", customers);
        return "/list";
    }

    @ExceptionHandler(CustomerException.class)
    public String handleCustomerException() {
        return "error.404";
    }

}