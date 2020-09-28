package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        
        try{
        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        
        if (request.getParameter("add")!= null){
            int total = firstNum + secondNum;
                    request.setAttribute("result", total);

        }
        
        else if (request.getParameter("subtract")!= null){
            int total = firstNum - secondNum;
                    request.setAttribute("result", total);

        }
        
        else if (request.getParameter("multiply")!= null){
            int total = firstNum * secondNum;
                    request.setAttribute("result", total);

        }
        
        else if (request.getParameter("mod")!= null){
            int total = firstNum % secondNum;
                    request.setAttribute("result", total);

        }
        
        }catch(Exception e){
            
            String total = "invalid";
            request.setAttribute("result", total);
        }
            request.setAttribute("first", first);
            request.setAttribute("second", second);

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
               
    }

}
