package com.example.furama_resort.controller;

import com.example.furama_resort.dto.AppUserDto;
import com.example.furama_resort.dto.CustomerDto;
import com.example.furama_resort.dto.EmployeeDto;
import com.example.furama_resort.model.entity.Customer;
import com.example.furama_resort.model.entity.Employee;


import com.example.furama_resort.model.login.AppRole;
import com.example.furama_resort.model.login.AppUser;
import com.example.furama_resort.model.login.UserRole;
import com.example.furama_resort.model.repository.IAppUserRepository;
import com.example.furama_resort.model.service.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IEducationDegreeService iEducationDegreeService;
    @Autowired
    IDivisionService iDivisionService;
    @Autowired
    IAppUserService iAppUserService;
    @Autowired
    IUserRoleService iUserRoleService;
    @Autowired
    IAppRoleService iAppRoleService;

    @RequestMapping(value = "/list")
    public String showListEmployee(@RequestParam(name = "search") Optional<String> search , @PageableDefault(size = 5) Pageable pageable, Model model) {
        String name="";
        if(search.isPresent()){
            name = search.get();
        }
        Page<Employee> employees = iEmployeeService.findEmployeeByName(name,pageable);
        model.addAttribute("listEmployee", employees);
        model.addAttribute("name", name);
        return "/employee/list-employee";
    }

    @RequestMapping(value = "/createForm")
    public String goCreateForm(Model model) {
        model.addAttribute("positionList", iPositionService.findPositionByAll());
        model.addAttribute("divisionList", iDivisionService.findDivisionByAll());
        model.addAttribute("educationList", iEducationDegreeService.findEducationDegreeByAll());
        model.addAttribute("employee", new EmployeeDto());
        return "employee/create-employee";
    }

    @PostMapping(value = "/create")
    public String saveEmployee(@Valid @ModelAttribute("employee") EmployeeDto employeeDto,BindingResult bindingResult
            , Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList", iPositionService.findPositionByAll());
            model.addAttribute("divisionList", iDivisionService.findDivisionByAll());
            model.addAttribute("educationList", iEducationDegreeService.findEducationDegreeByAll());
            return "employee/create-employee";
        }else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employee.setEmployeeFlag(true);
            AppUser appUser = new AppUser();
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            appUser.setUserName(employee.getAppUser().getUserName());
            String password = encoder.encode(employee.getAppUser().getEncrytedPassword());
            appUser.setEncrytedPassword(password);
            iAppUserService.save(appUser);
            employee.setAppUser(appUser);
            UserRole userRole = new UserRole();
            userRole.setAppUser(appUser);
            userRole.setAppRole(iAppRoleService.findByIdAppRole((long)2));
            iUserRoleService.save(userRole);
            iEmployeeService.save(employee);
            model.addAttribute("message", "New customer created successfully");
            return "redirect:/employee/list";
        }
    }

    @RequestMapping(value = "/view/{id}")
    public String goViewForm(@PathVariable Integer id, Model model) {
        try {
            Optional<Employee> employee = iEmployeeService.findEmployeeById(id);
            model.addAttribute("employee", employee.get());
            return "/employee/view-employee";
        } catch (Exception e) {
            return "/error.404";
        }
    }

    @RequestMapping(value = "/edit/{id}")
    public String goEditForm(@PathVariable Integer id, Model model) {
        try {
            Optional<Employee> employee = iEmployeeService.findEmployeeById(id);
            model.addAttribute("positionList", iPositionService.findPositionByAll());
            model.addAttribute("divisionList", iDivisionService.findDivisionByAll());
            model.addAttribute("educationList", iEducationDegreeService.findEducationDegreeByAll());
            model.addAttribute("employee", employee.get());
            return "/employee/edit-employee";
        } catch (Exception e) {
            return "/error.404";
        }
    }

    @PostMapping(value = "/edit-employee")
    public String updateEmployee(@Valid @ModelAttribute("employee") EmployeeDto employeeDto,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList", iPositionService.findPositionByAll());
            model.addAttribute("divisionList", iDivisionService.findDivisionByAll());
            model.addAttribute("educationList", iEducationDegreeService.findEducationDegreeByAll());
            return "employee/edit-employee";
        }else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto, employee);
            employee.setEmployeeFlag(true);
            iEmployeeService.save(employee);
            return "redirect:/employee/list";
        }
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam Integer id){
        Employee employee = iEmployeeService.findEmployeeById(id).orElse(null);
        employee.setEmployeeFlag(false);
        iEmployeeService.save(employee);
        return "redirect:/employee/list";
    }
}
