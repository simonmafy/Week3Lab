/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 562187
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String displayMessage = "";
        String age = request.getParameter("yourAge");
        
        if (age == null || age == ""){
            
            displayMessage = "You must give your current age";
        }
        
        if (age != null || age != "") {
            
            try{
                
            int ageInteger = Integer.parseInt(age);
            displayMessage = "your age next birthday is" + " " + (ageInteger + 1);
            
            }catch(Exception e){
                displayMessage = "Please put in a number";
            }
            
        }
            request.setAttribute("message", displayMessage);
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
        
             
    }   


}
