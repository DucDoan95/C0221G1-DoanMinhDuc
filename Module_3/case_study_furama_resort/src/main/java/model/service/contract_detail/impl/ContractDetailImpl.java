package model.service.contract_detail.impl;

import model.bean.ContractDetail;
import model.repository.contract_detail.ContractDetailRepository;
import model.service.contract_detail.IContractDetail;

public class ContractDetailImpl implements IContractDetail {
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();
    @Override
    public boolean createContractDetail(ContractDetail contractDetail) {
        return contractDetailRepository.createContractDetail(contractDetail);
    }
}
