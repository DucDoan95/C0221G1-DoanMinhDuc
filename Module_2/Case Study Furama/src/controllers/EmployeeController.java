package controllers;

import commons.ReadWriteFile;
import models.Employee;

import java.util.*;

public class EmployeeController {
    public static void showEmployee(){
        List<Employee>employeeList = new ArrayList<>();
        employeeList = ReadWriteFile.ReadFileEmployee("Employee.csv");
        Map<String, String> map = new HashMap<String, String>();
        for(int i=0;i<employeeList.size();i++)
        {
            map.put(employeeList.get(i).getId(),employeeList.get(i).toString());
        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
