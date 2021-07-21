package com.example.furama_resort.controller;

import com.example.furama_resort.dto.CustomerDto;
import com.example.furama_resort.model.entity.Customer;
import com.example.furama_resort.model.service.ICustomerService;
import com.example.furama_resort.model.service.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @RequestMapping(value = "/list")
    public String showListCustomer(@RequestParam(name = "search")Optional<String> search,@RequestParam(name = "idCard") Optional<String> idCard,@RequestParam(name = "phone") Optional<String> phone ,@PageableDefault(size = 5) Pageable pageable, Model model) {
        String name = "";
        String idCards = "";
        String phones ="";
        if(search.isPresent() || idCard.isPresent() || phone.isPresent()){
            name=search.get();
            idCards=idCard.get();
            phones=phone.get();
        }

        Page<Customer> customers = iCustomerService.findCustomerByName(name,idCards,phones,pageable);
        model.addAttribute("listCustomer", customers);
        model.addAttribute("search", name);
        model.addAttribute("idCard", idCards);
        model.addAttribute("phone", phones);
        return "/customer/list-customer";
    }

    @RequestMapping(value = "/createForm")
    public String goCreateForm(Model model) {
        model.addAttribute("customerTypeList", iCustomerTypeService.findCustomerTypeByAll());
        model.addAttribute("customer", new CustomerDto());
        return "customer/create-customer";
    }

    @PostMapping(value = "/create")
    public String saveCustomer(@Valid @ModelAttribute("customer") CustomerDto customerDto, BindingResult bindingResult, Model model) {
       if(bindingResult.hasErrors()){
           model.addAttribute("customerTypeList", iCustomerTypeService.findCustomerTypeByAll());
           return "customer/create-customer";
       }else {
           Customer customer = new Customer();
           BeanUtils.copyProperties(customerDto, customer);
           customer.setCustomerFlag(true);
           iCustomerService.save(customer);
           model.addAttribute("message", "New customer created successfully");
           return "redirect:/customer/list";
       }
    }

    @RequestMapping(value = "/view/{id}")
    public String goViewForm(@PathVariable String id, Model model) {
        try {
            Optional<Customer> customer = iCustomerService.findCustomerById(id);
            model.addAttribute("customer", customer.get());
            return "/customer/view-customer";
        } catch (Exception e) {
            return "/error.404";
        }
    }

    @RequestMapping(value = "/edit/{id}")
    public String goEditForm(@PathVariable String id, Model model) {
        try {
            Optional<Customer> customer = iCustomerService.findCustomerById(id);
            model.addAttribute("customerTypeList", iCustomerTypeService.findCustomerTypeByAll());
            model.addAttribute("customer", customer.get());
            return "/customer/edit-customer";
        } catch (Exception e) {
            return "/error.404";
        }
    }

    @PostMapping(value = "/edit-customer")
    public String updateCustomer(@Valid @ModelAttribute("customer") CustomerDto customerDto,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("customerTypeList", iCustomerTypeService.findCustomerTypeByAll());
            return "customer/edit-customer";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customer.setCustomerFlag(true);
            iCustomerService.save(customer);
//            model.addAttribute("customer", customer);
//            model.addAttribute("customerTypeList", iCustomerTypeService.findCustomerTypeByAll());
            model.addAttribute("message", "Customer updated successfully");
            return "redirect:/customer/list";
        }
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam String id){
        Customer customer = iCustomerService.findCustomerById(id).orElse(null);
        customer.setCustomerFlag(false);
        iCustomerService.save(customer);
        return "redirect:/customer/list";
    }
}
