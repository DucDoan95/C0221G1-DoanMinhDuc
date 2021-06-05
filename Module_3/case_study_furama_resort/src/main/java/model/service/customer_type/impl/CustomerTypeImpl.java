package model.service.customer_type.impl;

import model.bean.CustomerType;
import model.bean.Employee;
import model.repository.customer_type.CustomerTypeRepository;
import model.service.customer_type.ICustomerType;

import java.util.List;

public class CustomerTypeImpl implements ICustomerType {
    CustomerTypeRepository customerTypeRepository = new CustomerTypeRepository();
    @Override
    public CustomerType findCustomerTypeByID(int id) {
        return customerTypeRepository.findCustomerTypeByID(id);
    }

    @Override
    public List<CustomerType> getAllCustomerType() {
        return customerTypeRepository.getAllCustomerType();
    }
}
