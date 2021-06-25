package com.example.validate_form_sign.model.service.impl;

import com.example.validate_form_sign.model.entity.User;
import com.example.validate_form_sign.model.repository.IUserRepository;
import com.example.validate_form_sign.model.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository iUserRepository;
    @Override
    public void save(User user) {
        iUserRepository.save(user);
    }
}
