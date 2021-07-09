package com.example.furama_resort.model.service;

import com.example.furama_resort.model.login.AppRole;

public interface IAppRoleService {
    AppRole findByIdAppRole(Long id);
}
