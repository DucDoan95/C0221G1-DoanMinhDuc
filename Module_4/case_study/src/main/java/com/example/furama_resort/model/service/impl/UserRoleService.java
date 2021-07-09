package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.login.UserRole;
import com.example.furama_resort.model.repository.IUserRoleRepository;
import com.example.furama_resort.model.service.IAppUserService;
import com.example.furama_resort.model.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService implements IUserRoleService {
    @Autowired
    IUserRoleRepository iUserRoleRepository;
    @Override
    public void save(UserRole userRole) {
        iUserRoleRepository.save(userRole);
    }
}
