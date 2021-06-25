package com.example.validate_form_sign.dto;

import javax.validation.constraints.*;

public class UserDto {
    private Integer id;
    @NotBlank(message = "Enter FirstName!")
    @Size(min = 5,max = 45,message = "length min = 5 and max =45")
    private String firstName;
    @NotBlank(message = "Enter LastName!")
    @Size(min = 5,max = 45,message = "length min = 5 and max =45")
    private String lastName;
    @Pattern(regexp = "^0\\d{9,10}",message = "number format (0xxxxxxxx) X is a number")
    private String phoneNumber;
    @NotNull(message = "Enter Age!")
    @Min(value = 18,message = "age >=18")
    private Integer age;
    @NotBlank(message = "Enter Email!")
    @Email(message = "invalid email format")
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
