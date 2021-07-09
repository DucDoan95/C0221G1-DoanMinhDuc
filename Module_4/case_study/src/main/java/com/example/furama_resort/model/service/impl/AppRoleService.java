package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.login.AppRole;
import com.example.furama_resort.model.repository.IAppRoleRepository;
import com.example.furama_resort.model.service.IAppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    IAppRoleRepository iAppRoleRepository;
    @Override
    public AppRole findByIdAppRole(Long id) {
        return iAppRoleRepository.findById(id).orElse(null);
    }
}
