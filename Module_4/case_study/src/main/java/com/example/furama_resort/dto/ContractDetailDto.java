package com.example.furama_resort.dto;

import com.example.furama_resort.model.entity.Attach_Service;
import com.example.furama_resort.model.entity.Contract;

import javax.persistence.*;

public class ContractDetailDto {
    private Integer contractDetailId;
    private Contract contract;
    private Attach_Service attach_service;
    private int quantity;

    public ContractDetailDto() {
    }

    public Integer getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Integer contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Attach_Service getAttach_service() {
        return attach_service;
    }

    public void setAttach_service(Attach_Service attach_service) {
        this.attach_service = attach_service;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
