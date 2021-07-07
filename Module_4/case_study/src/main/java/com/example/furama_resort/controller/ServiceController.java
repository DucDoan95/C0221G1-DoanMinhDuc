package com.example.furama_resort.controller;

import com.example.furama_resort.dto.CustomerDto;
import com.example.furama_resort.dto.ServiceDto;
import com.example.furama_resort.model.entity.Customer;
import com.example.furama_resort.model.entity.Service;
import com.example.furama_resort.model.service.IRentTypeService;
import com.example.furama_resort.model.service.IServiceService;
import com.example.furama_resort.model.service.IServiceTypeService;
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
@RequestMapping(value = "/service")
public class ServiceController {
    @Autowired
    IServiceService iServiceService;
    @Autowired
    IServiceTypeService iServiceTypeService;
    @Autowired
    IRentTypeService iRentTypeService;
    @RequestMapping(value = "/list")
    public String showListService(@RequestParam(name = "search") Optional<String> search , @PageableDefault(size = 5) Pageable pageable, Model model) {String names="";
        String name="";
        if(search.isPresent()){
            name = search.get();
        }
        Page<Service> services = iServiceService.findServiceByName(name,pageable);
        model.addAttribute("listService", services);
        model.addAttribute("listServiceType", iServiceTypeService.findServiceTypeByAll());
        model.addAttribute("listRentType", iRentTypeService.findRentTypeByAll());
        model.addAttribute("name", name);
        return "/service/list-service";
    }

    @RequestMapping(value = "/view/{id}")
    public String goViewForm(@PathVariable String id, Model model) {
        try {
            Optional<Service> service = iServiceService.findServiceById(id);
            model.addAttribute("service", service.get());
            return "/service/view-service";
        } catch (Exception e) {
            return "/error.404";
        }
    }

    @RequestMapping(value = "/createForm")
    public String goCreateForm(Model model) {
        model.addAttribute("serviceTypeList", iServiceTypeService.findServiceTypeByAll());
        model.addAttribute("rentTypeList", iRentTypeService.findRentTypeByAll());
        model.addAttribute("service", new ServiceDto());
        return "service/create-service";
    }

    @PostMapping(value = "/create")
    public String saveCustomer(@Valid @ModelAttribute("service") ServiceDto serviceDto, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("serviceTypeList", iServiceTypeService.findServiceTypeByAll());
            model.addAttribute("rentTypeList", iRentTypeService.findRentTypeByAll());
            return "service/create-service";
        }else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto, service);
            iServiceService.save(service);
            model.addAttribute("message", "New customer created successfully");
            return "redirect:/service/list";
        }
    }
}
