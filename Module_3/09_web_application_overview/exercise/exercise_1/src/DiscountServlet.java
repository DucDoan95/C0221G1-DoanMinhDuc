import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/calculator")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount =Float.parseFloat(request.getParameter("discount"));
        double amount = price*discount*0.01;

        request.setAttribute("amountResult",amount);
        request.setAttribute("descriptionResult",description);
        request.setAttribute("priceResult",price);
        request.setAttribute("discountResult",discount);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display-discount.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
