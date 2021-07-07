package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.Attach_Service;
import com.example.furama_resort.model.repository.IAttachServiceRepository;
import com.example.furama_resort.model.service.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceImpl implements IAttachServiceService {
    @Autowired
    IAttachServiceRepository iAttachServiceRepository;
    @Override
    public List<Attach_Service> findAttachServiceByAll() {
        return (List<Attach_Service>) iAttachServiceRepository.findAll();
    }
}
