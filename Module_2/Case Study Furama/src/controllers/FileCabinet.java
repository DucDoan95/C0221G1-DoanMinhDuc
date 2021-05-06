package controllers;

import commons.ReadWriteFile;
import models.Customer;
import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FileCabinet {
    public static void findFile() {
        Stack<String> stringStack = new Stack<>();
        List<Employee> employeeList = new ArrayList<>();
        employeeList = ReadWriteFile.ReadFileEmployee("Employee.csv");
        for (int i = 0; i < employeeList.size(); i++) {
            stringStack.add(employeeList.get(i).toString());
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Name Employee to find");
            String name = scanner.nextLine();
            for (int i = 0; i < stringStack.size(); i++) {
                if (stringStack.get(i).contains(name)) {
                    System.out.println(stringStack.get(i));
                    return;
                }
            }
            System.err.println("Dont have file in the system ");
        }
    }
}
