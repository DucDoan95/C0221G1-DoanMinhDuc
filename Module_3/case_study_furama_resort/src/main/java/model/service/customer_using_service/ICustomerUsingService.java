package model.service.customer_using_service;


import model.bean.AttachService;
import model.bean.Contract;
import model.bean.CustomerUsingService;
import model.bean.Employee;

import java.util.List;

public interface ICustomerUsingService {

    public List<CustomerUsingService> getAllCustomerUsingService();
    public List<AttachService> getAllAttachServiceUsing();
    public List<CustomerUsingService> searchCustomerUsingServiceByName(String name);

}
