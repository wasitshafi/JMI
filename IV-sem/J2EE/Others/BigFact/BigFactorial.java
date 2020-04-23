/**
    @author wasitshafi
    @since 06-04-2020
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BigFactorial extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        BigInteger fact = BigInteger.ONE;
        PrintWriter out = response.getWriter();
        String num = request.getParameter("txtbN");
        
        for(int i = Integer.valueOf(num) ; i > 1 ; i--) fact = fact.multiply(BigInteger.valueOf(i));
        out.println("Factorial of " + num + " is : " + fact);
    }
}