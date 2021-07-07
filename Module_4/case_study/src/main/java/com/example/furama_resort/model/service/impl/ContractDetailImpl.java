package com.example.furama_resort.model.service.impl;

import com.example.furama_resort.model.entity.Contract;
import com.example.furama_resort.model.entity.ContractDetail;
import com.example.furama_resort.model.repository.IContractDetailRepository;
import com.example.furama_resort.model.service.IContractDetailService;
import com.example.furama_resort.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractDetailImpl implements IContractDetailService {
    @Autowired
    IContractDetailRepository iContractDetailRepository;

    @Override
    public Page<ContractDetail> findContractDetailByAll(Pageable pageable) {
        return iContractDetailRepository.findAll(pageable);
    }

    @Override
    public Optional<ContractDetail> findContractDetailById(Integer id) {
        return iContractDetailRepository.findById(id);
    }

    @Override
    public void save(ContractDetail contractDetail) {
        iContractDetailRepository.save(contractDetail);
    }
}
