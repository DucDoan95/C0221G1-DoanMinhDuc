package com.example.validating_form_input.controller;

import com.example.validating_form_input.dbo.UserDto;

import com.example.validating_form_input.model.entity.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping(value = "/user")
    public String showForm(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "/index";
    }

    @PostMapping("/validateUser")
    public String checkValidation(@Validated @ModelAttribute UserDto userDto,
                                  BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "/index";
        }
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return "/result";
    }
}
