/**
  @author wasitshafi
  @since  15-03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Factorial extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        int n = Integer.parseInt(request.getParameter("n"));
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
            "<title>Welcom to J2EE...!</title>" +
        "</title>" +
        "<body>" +
            "<b style='color:teal; text-align:center; display:block; font:bold 30px Comic Sans MS;'>Factorial of " + n + " is : " + getFactorial(n) + "</b>" +
        "</body>" +
        "</html>");
        out.close();
    }
    public String getFactorial(int n)
    {
        BigInteger fact = BigInteger.ONE;
        while(n != 1) fact = fact.multiply(BigInteger.valueOf(n--));
        return fact.toString();
    }
}