package controller;

import model.bean.*;
import model.service.contract.IContract;
import model.service.contract.impl.ContractImpl;
import model.service.customer.ICustomer;
import model.service.customer.impl.CustomerImpl;
import model.service.customer_type.ICustomerType;
import model.service.customer_type.impl.CustomerTypeImpl;
import model.service.employee.IEmployee;
import model.service.employee.impl.EmployeeImpl;
import model.service.services.IServices;
import model.service.services.impl.ServicesImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    IContract iContract = new ContractImpl();
    IEmployee iEmployee = new EmployeeImpl();
    ICustomer iCustomer = new CustomerImpl();
    IServices iServices = new ServicesImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createContract(request, response);
                break;
            case "edit":
                editContract(request,response);
                break;
            default:
                break;
        }
    }

    private void editContract(HttpServletRequest request, HttpServletResponse response) {
        int contractID = Integer.parseInt(request.getParameter("contractID"));
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        Double contractDeposit = Double.parseDouble(request.getParameter("contractDeposit"));
        int employeeID = Integer.parseInt(request.getParameter("employeeID"));
        int customerID = Integer.parseInt(request.getParameter("customerID"));
        int serviceID = Integer.parseInt(request.getParameter("serviceID"));
        Customer customer = iCustomer.findCustomerByID(customerID);
        Employee employee = iEmployee.findEmployeeByID(employeeID);
        Services services = iServices.findServiceByID(serviceID);

        List<Employee> employeeList = iEmployee.getAllEmployee();
        List<Customer> customerList = iCustomer.getAllCustomer();
        List<Services> servicesList = iServices.getAllServices();

        Contract contract = new Contract(contractID,contractStartDate,contractEndDate,contractDeposit,employee,customer,services);
        boolean check = iContract.editContractUsing(contract);
        if (check) {
            request.setAttribute("message", "Edit successful");
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("customerList", customerList);
            request.setAttribute("servicesList", servicesList);
        } else {
            request.setAttribute("message", "Edit unsuccessful");
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("customerList", customerList);
            request.setAttribute("servicesList", servicesList);
        }
        request.setAttribute("contract", contract);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/contract/edit-contract.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) {
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        Double contractDeposit = Double.parseDouble(request.getParameter("contractDeposit"));
        int employeeID = Integer.parseInt(request.getParameter("employeeID"));
        int customerID = Integer.parseInt(request.getParameter("customerID"));
        int serviceID = Integer.parseInt(request.getParameter("serviceID"));
        Employee employee = iEmployee.findEmployeeByID(employeeID);
        Customer customer = iCustomer.findCustomerByID(customerID);
        Services services = iServices.findServiceByID(serviceID);
        Contract contract = new Contract(contractStartDate, contractEndDate, contractDeposit, employee, customer, services);
        boolean check = iContract.createContract(contract);
        List<Employee> employeeList = iEmployee.getAllEmployee();
        List<Customer> customerList = iCustomer.getAllCustomer();
        List<Services> servicesList = iServices.getAllServices();
        if (check) {
            request.setAttribute("message", "Create successful");
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("customerList", customerList);
            request.setAttribute("servicesList", servicesList);
        } else {
            request.setAttribute("message", "Create unsuccessful");
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("customerList", customerList);
            request.setAttribute("servicesList", servicesList);
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/contract/create-contract.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateContractForm(request, response);
                break;
            case "edit":
                showEditContractForm(request,response);
            default:
                break;
        }
    }

    private void showEditContractForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("contractID"));
        Contract contract = iContract.findContractByID(id);
        List<Employee> employeeList = iEmployee.getAllEmployee();
        List<Customer> customerList = iCustomer.getAllCustomer();
        List<Services> servicesList = iServices.getAllServices();
        RequestDispatcher requestDispatcher;

        if (contract == null) {
            requestDispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/view/contract/edit-contract.jsp");
            request.setAttribute("contract", contract);
            request.setAttribute("employeeList", employeeList);
            request.setAttribute("customerList", customerList);
            request.setAttribute("servicesList", servicesList);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateContractForm(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = iEmployee.getAllEmployee();
        List<Customer> customerList = iCustomer.getAllCustomer();
        List<Services> servicesList = iServices.getAllServices();
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("customerList", customerList);
        request.setAttribute("servicesList", servicesList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/contract/create-contract.jsp");

        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
