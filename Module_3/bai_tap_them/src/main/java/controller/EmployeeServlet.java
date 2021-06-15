package controller;

import model.bean.Employee;
import model.service.IEmployee;
import model.service.impl.EmployeeImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "StudentServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    IEmployee iEmployee = new EmployeeImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request,response);
                break;
            case "edit":
                editEmployee(request,response);
                break;
            case "delete":
                deleteEmployee(request,response);
                break;
            default:

                break;
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("employeeID"));
        iEmployee.deleteEmployee(id);
        try {
            response.sendRedirect("/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        Integer employeeID = Integer.parseInt(request.getParameter("employeeID"));
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday = request.getParameter("employeeBirthday");
        Employee employee= new Employee(employeeID,employeeName,employeeBirthday);
        Map<String,String> msgMap =iEmployee.editEmployee(employee);

        if (msgMap.isEmpty()) {
            request.setAttribute("message", "Edit successful");
            request.setAttribute("employee",employee);
        } else {
            request.setAttribute("msgName",msgMap.get("name"));
            request.setAttribute("msgBirthday",msgMap.get("birthday"));
            request.setAttribute("message", "Edit unsuccessful");
            request.setAttribute("employee",employee);

        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/employee/edit-employee.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday = request.getParameter("employeeBirthday");
        Employee employee= new Employee(employeeName,employeeBirthday);
        Map<String,String> msgMap =iEmployee.createEmployee(employee);

        if (msgMap.isEmpty()) {
            request.setAttribute("message", "Create successful");
        } else {
            request.setAttribute("msgName",msgMap.get("name"));
            request.setAttribute("msgBirthday",msgMap.get("birthday"));
            request.setAttribute("message", "Create unsuccessful");
            request.setAttribute("employee",employee);

        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/employee/create-employee.jsp");
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
                showFromCreate(request, response);
                break;
            case "edit":
                showFromEdit(request,response);
                break;
            case "search":
                searchByName(request,response);
                break;
            default:
                showListEmployee(request, response);
                break;
        }
    }

    private void searchByName(HttpServletRequest request, HttpServletResponse response) {
        String search = request.getParameter("search");
        List<Employee> employeeList = iEmployee.searchEmployeeByName(search);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/employee/list-employee.jsp");
        request.setAttribute("employee", employeeList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFromEdit(HttpServletRequest request, HttpServletResponse response) {
        int employeeID = Integer.parseInt(request.getParameter("employeeID"));
        Employee employee = iEmployee.findEmployeeByID(employeeID);
        RequestDispatcher requestDispatcher;

        if (employee == null) {
            requestDispatcher = request.getRequestDispatcher("/view/error-404.jsp");
        } else {
            requestDispatcher = request.getRequestDispatcher("/view/employee/edit-employee.jsp");
            request.setAttribute("employee", employee);
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFromCreate(HttpServletRequest request, HttpServletResponse response) {


        List<Employee> employeeList = iEmployee.getAllEmployee();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/employee/create-employee.jsp");
        request.setAttribute("employeeList",employeeList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = iEmployee.getAllEmployee();

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/employee/list-employee.jsp");
        request.setAttribute("employee", employeeList);
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
