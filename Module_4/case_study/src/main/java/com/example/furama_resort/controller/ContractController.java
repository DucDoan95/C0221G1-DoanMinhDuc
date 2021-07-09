package com.example.furama_resort.controller;

import com.example.furama_resort.dto.ContractDto;
import com.example.furama_resort.dto.CustomerDto;
import com.example.furama_resort.model.entity.Contract;
import com.example.furama_resort.model.entity.Customer;
import com.example.furama_resort.model.service.IContractService;
import com.example.furama_resort.model.service.ICustomerService;
import com.example.furama_resort.model.service.IEmployeeService;
import com.example.furama_resort.model.service.IServiceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/contract")
public class ContractController {
    @Autowired
    IContractService iContractService;
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IServiceService iServiceService;
    @RequestMapping(value = "/list")
    public String showListContract( @PageableDefault(size = 5) Pageable pageable, Model model) {
        Page<Contract> contract = iContractService.findContractByAll(pageable);
        model.addAttribute("listContract", contract);
        return "/contract/list-contract";
    }
    @RequestMapping(value = "/createForm")
    public String goCreateForm(Model model) {
        model.addAttribute("contract", new ContractDto());
        model.addAttribute("customerList", iCustomerService.findCustomerByAll());
        model.addAttribute("employeeList", iEmployeeService.findEmployeeByAll());
        model.addAttribute("serviceList", iServiceService.findServiceByAll());
        return "contract/create-contract";
    }

    @PostMapping(value = "/create")
    public String saveContract(@Valid @ModelAttribute("contract") ContractDto contractDto, BindingResult bindingResult, Model model) {
        new ContractDto().validate(contractDto,bindingResult);
        if(bindingResult.hasErrors()){
            model.addAttribute("customerList", iCustomerService.findCustomerByAll());
            model.addAttribute("employeeList", iEmployeeService.findEmployeeByAll());
            model.addAttribute("serviceList", iServiceService.findServiceByAll());
            return "contract/create-contract";
        }else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            iContractService.save(contract);
            return "redirect:/contract/list";
        }
    }
}
