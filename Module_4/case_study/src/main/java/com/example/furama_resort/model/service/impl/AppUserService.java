package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.login.AppUser;
import com.example.furama_resort.model.repository.IAppUserRepository;
import com.example.furama_resort.model.service.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    IAppUserRepository iAppUserRepository;
    @Override
    public void save(AppUser appUser) {
        iAppUserRepository.save(appUser);
    }
}
