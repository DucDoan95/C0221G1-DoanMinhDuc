package controller;

import model.bean.CustomerUsingService;
import model.service.customer_using_service.ICustomerUsingService;
import model.service.customer_using_service.impl.CustomerUsingServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerUsingServiceServlet" ,urlPatterns = "/customer-using-service")
public class CustomerUsingServiceServlet extends HttpServlet {
    ICustomerUsingService iCustomerUsingService = new CustomerUsingServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            default:
                showListCustomerUsingService(request,response);
                break;
        }
    }

    private void showListCustomerUsingService(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerUsingService> customerUsingServiceList = iCustomerUsingService.getAllCustomerUsingService();
        request.setAttribute("customerUsingServiceList", customerUsingServiceList);
        try {
            RequestDispatcher requestDispatcher =request.getRequestDispatcher("/view/customer_using_service/list-customer-using-service.jsp");
            requestDispatcher.forward(request,response);

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
