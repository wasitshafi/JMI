/**
 * @author wasitshafi
 * @since 13-04-2020
 */
/*Write a complete JSP program for student examination processing. Assure that entire student examination data is 
stored in some database tables. Give option to enter students marks in different papers (only admin can do it), 
generate result report (student can access it without login). Any update to the examination system must be carried 
out by the Admin who need valid username and password. Make necessary assumption, if required. Uploaded 
individual files (html, jsp, .java, etc), rather than a zip/war file. Also write about your assumption made in the program.*/
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateLoginServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        final String USERNAME = "wasit";
        final String PASSWORD = "123";

        if(USERNAME.equals(request.getParameter("txtbUsername")) && PASSWORD.equals(request.getParameter("txtbPassword")) )
        {
          response.sendRedirect("insert.jsp");
        }
        else
          response.sendRedirect("index.jsp");
      }
}