/**
  @author wasitshafi
  @since  -03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
            "<title>Welcom to J2EE...!</title>" +
        "</title>" +
        "<body>" +
            "<b style='color:Tomato; text-align:center; display:block; font:bold 30px Comic Sans MS;'>Hello World</b>" +
        "</body>" +
        "</html>");
        out.close();
    }
}