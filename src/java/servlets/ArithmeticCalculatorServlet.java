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
public class ArithmeticCalculatorServlet extends HttpServlet {

   @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
               .forward(request, response);
   }
    
   @Override
   protected void doPost (HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       String getParam;
       String getOp;
       int first;
       int second;
       int result;
       
       request.setAttribute("result", "Result: ---");
       
       getParam = request.getParameter("first");
       first = Integer.parseInt(getParam);
       
       getParam = request.getParameter("second");
       second = Integer.parseInt(getParam);
       
       getOp = request.getParameter("operator");
       
       if (getOp.equals("+")){
           result = first + second;
           request.setAttribute("result", "Result: " + result);
       }
       
       else if (getOp.equals("-")){
           result = first - second;
           request.setAttribute("result", "Result: " + result);
       }
       
       else if (getOp.equals("x")){
           result = first * second;
           request.setAttribute("result", "Result: " + result);
       }
       
       else if (getOp.equals("%")){
           result = first % second;
           request.setAttribute("result", "Result: " + result);
       }
       
       else{
           request.setAttribute("message", "Invalid entry. Please enter valid numbers.");
       }
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);
      return;
   }
}