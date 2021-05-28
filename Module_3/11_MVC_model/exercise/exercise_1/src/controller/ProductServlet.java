package controller;

import model.bean.Product;
import model.service.IProductService;
import model.service.Impl.ProductServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = {"" ,"/product"})
public class ProductServlet extends HttpServlet {
    private IProductService productService = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }        switch (action){
            case "create":
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                showProductCustomer(request,response);
                break;

        }
    }

    private void showProductCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = productService.findByAll();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/product/display.jsp");
        request.setAttribute("products",products);
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
