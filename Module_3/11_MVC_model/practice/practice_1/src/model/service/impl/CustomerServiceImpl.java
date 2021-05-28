package model.service.impl;

import model.bean.Customer;
import model.reponsitory.CustomerRepository;
import model.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public void update(String id, Customer customer) {
        customerRepository.update(id, customer);
    }

    @Override
    public void remove(String id) {
        customerRepository.remove(id);
    }
}
