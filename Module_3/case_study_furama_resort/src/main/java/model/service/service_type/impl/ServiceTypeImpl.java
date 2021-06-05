package model.service.service_type.impl;

import model.bean.ServiceType;
import model.repository.service_type.ServiceTypeRepository;
import model.service.service_type.IServiceType;

import java.util.List;

public class ServiceTypeImpl implements IServiceType {
    ServiceTypeRepository serviceTypeRepository = new ServiceTypeRepository();
    @Override
    public ServiceType findServiceTypeByID(int id) {
        return serviceTypeRepository.findServiceTypeByID(id);
    }

    @Override
    public List<ServiceType> getAllServiceType() {
        return serviceTypeRepository.getAllServiceType();
    }
}
