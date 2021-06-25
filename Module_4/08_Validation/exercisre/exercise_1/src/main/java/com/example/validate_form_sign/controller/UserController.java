package com.example.validate_form_sign.controller;

import com.example.validate_form_sign.dto.UserDto;
import com.example.validate_form_sign.model.entity.User;
import com.example.validate_form_sign.model.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    IUserService iUserService;
    @GetMapping(value = "/user")
    public String showForm(Model model){
        model.addAttribute("userDto",new UserDto());
        return "/index";
    }

    @PostMapping(value = "/validation")
    public String validationUser(@Valid @ModelAttribute UserDto userDto, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "/index";
        }
        else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            iUserService.save(user);
            model.addAttribute("user",user);
            return "result";
        }
    }
}
