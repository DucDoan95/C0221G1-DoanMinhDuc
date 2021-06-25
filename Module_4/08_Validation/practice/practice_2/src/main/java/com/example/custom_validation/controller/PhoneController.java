package com.example.custom_validation.controller;

import com.example.custom_validation.dto.PhoneNumberDto;
import com.example.custom_validation.model.entity.PhoneNumber;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping(value = "/")
    public String showForm(Model model){
        model.addAttribute("phoneNumberDto", new PhoneNumberDto());
        return "/index";
    }

    @PostMapping(value = "/valid")
    public String checkValidation(@Valid @ModelAttribute PhoneNumberDto phoneNumberDto, BindingResult bindingResult, Model model){
        new PhoneNumberDto().validate(phoneNumberDto,bindingResult);
        if(bindingResult.hasErrors()){
            return "/index";
        }else {
            PhoneNumber phoneNumber = new PhoneNumber();
            BeanUtils.copyProperties(phoneNumberDto,phoneNumber);
            model.addAttribute("phoneNumber", phoneNumberDto);
            return "/result";
        }

    }
}
