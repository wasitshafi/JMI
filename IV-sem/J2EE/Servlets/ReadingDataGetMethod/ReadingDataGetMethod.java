/**
  @author wasitshafi
  @since  14-03-2020
*/
import java.util.Arrays;
import java.util.Enumeration;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadingDataGetMethod extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        StringBuilder sb = new StringBuilder();
        Enumeration parameterNames = request.getParameterNames();
        
        // If there is a chance of getting multiple values for any input parameter, getParameterValues() method will retrieve all of it values.
        // String[] ckhBoxQualifications = request.getParameterValues("chkQualification"); 
        while(parameterNames.hasMoreElements())
        {
            String name = (String)parameterNames.nextElement(); 
            sb.append("<b>" + name + "</b> : <i>" + request.getParameter(name) + "</i><br/>");
        }
        out.println("<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
            "<title>Welcom to J2EE...!</title>" +
        "</title>" +
        "<body>" +
        "<h2>List of parameter names : </h2>" +
            "<p>" + sb + "</p>" +
        "</body>" +
        "</html>");
        out.close();
    }
}