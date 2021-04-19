package controllers;

import models.Employee;

import java.util.Scanner;

public class NewEmployee {
    public static Employee addNewEmployee(){
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.println("Enter Employee ID: ");
        employee.setId(scanner.nextLine());
        System.out.println("Enter Employee Name: ");
        employee.setName(scanner.nextLine());
        System.out.println("Enter Employee Birthday: ");
        employee.setBirthday(scanner.nextLine());
        System.out.println("Enter Employee ID Card: ");
        employee.setIdCard(scanner.nextLine());
        System.out.println("Enter Employee Phone Number: ");
        employee.setPhoneNumber(scanner.nextLine());
        System.out.println("Enter Employee Email: ");
        employee.setEmail(scanner.nextLine());
        System.out.println("Enter Employee Education Level: ");
        employee.setEducationLevel(scanner.nextLine());
        System.out.println("Enter Employee Position: ");
        employee.setPosition(scanner.nextLine());
        System.out.println("Enter Employee Salary: ");
        employee.setSalary(Double.parseDouble(scanner.nextLine()));
        return employee;

    }
}
