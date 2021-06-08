package model.service;

import model.bean.Customer;

import java.util.List;
import java.util.Map;

public interface ICustomer {
    public Map<String,String> createCustomer(Customer customer);
    public Customer findCustomerByID(String id);
    public List<Customer> getAllCustomer();
    public boolean editCustomer(Customer customer);
    public boolean deleteCustomer(String id);
    public List<Customer> searchCustomerByName(String name);
}
