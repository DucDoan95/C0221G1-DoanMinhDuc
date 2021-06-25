package com.example.custom_validation.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;


public class PhoneNumberDto implements Validator {
    @NotEmpty(message = "emtyyyyyyyyy")
    private String number;

    public PhoneNumberDto() {
    }

    public PhoneNumberDto(String number) {
        this.number = number;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumberDto phoneNumberDto = (PhoneNumberDto) target;
        String number = phoneNumberDto.getNumber();
        ValidationUtils.rejectIfEmpty(errors, "number", "number.empty","error...");
        if (number.length()>11 || number.length()<10){
            errors.rejectValue("number", "number.length");
        }
        if (!number.startsWith("0")){
            errors.rejectValue("number", "number.startsWith");
        }
        if (!number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number", "number.matches");
        }
    }
}
