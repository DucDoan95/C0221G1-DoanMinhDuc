package model.service.impl;

import model.bean.Customer;
import model.repository.customer.CustomerRepository;
import model.service.ICustomer;
import model.service.common.Validate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements ICustomer {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public Map<String,String> createCustomer(Customer customer) {
        Map<String,String> mapMsg = new HashMap<>();
        boolean flag =true;

        if("".equals(customer.getCustomerName())){
            mapMsg.put("name","Please input Customer Name!");
            flag = false;
        }

        if("".equals(customer.getCustomerID())){
            mapMsg.put("id","Please input Customer ID");
            flag=false;
        }else if(!Validate.checkCustomerID(customer.getCustomerID())){
            mapMsg.put("id","Invalid format email. Hint: KH-XXXX (X is number 0-9)");
            flag=false;
        }


        if("".equals(customer.getCustomerIDCard())){
            mapMsg.put("idCard","Please input Customer ID Card");
            flag=false;
        }else if(!Validate.checkIDCard(customer.getCustomerIDCard())){
            mapMsg.put("idCard","Invalid format ID Card. Hint: XXXXXXXXX hoặc XXXXXXXXXXXX (X is number 0-9)");
            flag=false;
        }


        if("".equals(customer.getCustomerPhone())){
            mapMsg.put("phone","Please input Customer Phone");
            flag=false;
        }else if(!Validate.checkPhoneNumber(customer.getCustomerPhone())){
            mapMsg.put("phone","Invalid format Phone Number. Hint: 090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or (84)+91xxxxxxx");
            flag=false;
        }

        if("".equals(customer.getCustomerEmail())){
            mapMsg.put("email","Please input Customer Phone");
            flag=false;
        }else if(!Validate.checkEmail(customer.getCustomerEmail())){
            mapMsg.put("email","Invalid format Phone Number. Hint: xxx@xxx.xxx");
            flag=false;
        }

        if("".equals(customer.getCustomerAddress())){
            mapMsg.put("address","Please input Customer Address");
            flag=false;
        }
        if(flag){
            customerRepository.createCustomer(customer);
        }
        return mapMsg;
    }

    @Override
    public Customer findCustomerByID(String id) {
        return customerRepository.findCustomerByID(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.getAllCustomer();
    }

    @Override
    public boolean editCustomer(Customer customer) {
        return customerRepository.editCustomer(customer);
    }

    @Override
    public boolean deleteCustomer(String id) {
        return customerRepository.deleteCustomer(id);

    }

    @Override
    public List<Customer> searchCustomerByName(String name) {
        return customerRepository.searchCustomerByName(name);
    }
}
