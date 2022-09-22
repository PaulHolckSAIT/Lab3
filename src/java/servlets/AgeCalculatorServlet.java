package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paulh
 */
public class AgeCalculatorServlet extends HttpServlet {

   @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response);
   }
    
   @Override
   protected void doPost (HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
      String getParam = request.getParameter("currentage");
      int age = Integer.parseInt(getParam);
      age++;
      
      if (age > 0) {
            request.setAttribute("result", "Age will be " + age + " on your next birthday.");
      }
      
      else{
            request.setAttribute("message", "Invalid entry. Please enter a valid age.");
      }
      
      getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
      return;
   
  
}
}
