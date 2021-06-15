package model.service.impl;

import model.bean.Employee;
import model.repository.EmployeeRepository;
import model.service.IEmployee;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImpl implements IEmployee {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public Map<String, String> createEmployee(Employee employee) {
        Map<String,String> mapMsg = new HashMap<>();
        boolean flag =true;
        if("".equals(employee.getEmployeeName())){
            mapMsg.put("name","Please input Employee Name!");
            flag = false;
        }else if(!employee.getEmployeeName().matches("^([a-zA-Z]{1,}[ ]{0,}[a-zA-Z]{1,}){0,}$")){
            mapMsg.put("name","Invalid ");
            flag=false;
        }


        if("".equals(employee.getEmployeeBirthday())){
            mapMsg.put("birthday","Please input Employee Birthday");
            flag=false;
        }else if(Year.now().getValue()-Integer.parseInt(employee.getEmployeeBirthday().substring(0,4))<18){
            mapMsg.put("birthday","Invalid");
            flag=false;
        }

        if(flag){
            employeeRepository.createEmployee(employee);
        }
        return mapMsg;
    }

    @Override
    public Employee findEmployeeByID(int id) {
        return employeeRepository.findEmployeeByID(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    @Override
    public Map<String,String> editEmployee(Employee employee) {
        Map<String,String> mapMsg = new HashMap<>();
        boolean flag =true;
        if("".equals(employee.getEmployeeName())){
            mapMsg.put("name","Please input Employee Name!");
            flag = false;
        }else if(!employee.getEmployeeName().matches("^([a-zA-Z]{1,}[ ]{0,}[a-zA-Z]{1,}){0,}$")){
            mapMsg.put("name","Invalid ");
            flag=false;
        }


        if("".equals(employee.getEmployeeBirthday())){
            mapMsg.put("birthday","Please input Employee Birthday");
            flag=false;
        }else if(Year.now().getValue()-Integer.parseInt(employee.getEmployeeBirthday().substring(0,4))<18){
            mapMsg.put("birthday","Invalid");
            flag=false;
        }

        if(flag){
            employeeRepository.editEmployee(employee);
        }
        return mapMsg;
    }

    @Override
    public boolean deleteEmployee(int id) {
        return employeeRepository.deleteEmployee(id);
    }

    @Override
    public List<Employee> searchEmployeeByName(String name) {
        return employeeRepository.searchEmployeeByName(name);
    }
}
