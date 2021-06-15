package model.service;

import model.bean.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployee {
    public Map<String,String> createEmployee(Employee employee);
    public Employee findEmployeeByID(int id);
    public List<Employee> getAllEmployee();
    public Map<String,String> editEmployee(Employee employee);
    public boolean deleteEmployee(int id);
    public List<Employee> searchEmployeeByName(String name);
}
