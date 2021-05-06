package commons;

import models.*;

import java.io.*;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static final String PATH = "E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\Case Study Furama\\src\\data\\";

    public static void WriteFile(String nameFile, List<Services> servicesList, boolean statusWrite) {
        File file = new File(PATH + nameFile);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, statusWrite));
            for (Services services : servicesList) {
                bufferedWriter.write(services.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("error writing...");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Services> ReadFile(String nameFile) {
        List<Services> servicesList = new ArrayList<>();
        File file = new File(PATH + nameFile);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            Services services = null;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp.length == 10) {
                    Services villa = new Villa(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                    servicesList.add(villa);
                } else if (temp.length == 9) {
                    Services house = new House(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                    servicesList.add(house);
                } else {
                    Services room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6]);
                    servicesList.add(room);
                }
            }
        } catch (IOException e) {
            System.err.println("error reading...");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return servicesList;
    }

    public static void WriteFileCustomer(String nameFile, List<Customer> customerList, boolean statusWrite) {
        File file = new File(PATH + nameFile);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, statusWrite));
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("error writing...");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Customer> ReadFileCustomer(String nameFile) {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(PATH + nameFile);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Customer customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                customerList.add(customer);
            }
        } catch (
                IOException e) {
            System.err.println("error reading...");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return customerList;
    }

    public static List<Employee> ReadFileEmployee(String nameFile) {
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(PATH + nameFile);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Employee employee = new Employee(temp[0], temp[1], temp[2],temp[3]);
                employeeList.add(employee);
            }
        } catch (
                IOException e) {
            System.err.println("error reading...");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employeeList;
    }
}
