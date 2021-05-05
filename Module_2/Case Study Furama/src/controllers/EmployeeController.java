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
            if(i<9){
                map.put("Mã số 00"+(i+1),employeeList.get(i).toString());
            }else if(i<99){
                map.put("Mã số 0"+(i+1),employeeList.get(i).toString());
            }else {
                map.put("Mã số "+(i+1),employeeList.get(i).toString());
            }

        }
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
