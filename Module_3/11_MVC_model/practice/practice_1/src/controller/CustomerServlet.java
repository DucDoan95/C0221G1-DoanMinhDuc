package controller;

import model.bean.Customer;
import model.service.ICustomerService;
import model.service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"", "/customer"})
public class CustomerServlet extends HttpServlet {
    ICustomerService customers = new CustomerServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                addCustomer(request,response);
                break;
            case "edit":
                update(request, response);
                break;
            case "remove":
                remove(request,response);
                break;


            default:
                showListCustomer(request, response);
                break;

        }
    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer = customers.findById(id);
        if(customer==null){
            customers.add(new Customer(id,name,email,address));
            try {
                response.sendRedirect("/customer");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/error404.jsp");
        }

    }

    private void remove(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        customers.remove(id);
        try {
            response.sendRedirect("/customer");
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
                showAddForm(request,response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "remove":
                showRemoveForm(request,response);
                break;

            default:
                showListCustomer(request, response);
                break;

        }
    }

    private void showAddForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/view/customer/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showRemoveForm(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        Customer customer=customers.findById(id);
        request.setAttribute("customers",customer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/view/customer/delete.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String id=request.getParameter("id");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        Customer customer=new Customer(id,name,email,address);
        customers.update(id,customer);
        request.setAttribute("customers",customer);
        request.setAttribute("message","update thành công");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/view/customer/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
        Customer customer = customers.findById(id);
        request.setAttribute("customers",customer);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/view/customer/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showListCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customers.findAll();
        Customer cus = new Customer("1", "2", "3", "4");
        request.setAttribute("customers", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customer/display.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }
}
