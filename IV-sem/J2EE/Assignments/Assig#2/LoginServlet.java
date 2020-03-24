/**
    @author wasitshafi
    @since  24-03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        final String USERNAME = "wasit";
        final String PASSWORD = "123";
        Cookie[] cks = request.getCookies();
        if(cks != null)
        {
            for(Cookie ck : cks)
                if(ck.getName().equals(USERNAME) && ck.getValue().equals(PASSWORD))
                    response.sendRedirect("home.html");
        }
        String username = request.getParameter("txtbUsername").toString();
        String password = request.getParameter("txtbPassword").toString();

        if(USERNAME.equals(username) && PASSWORD.equals(password))
        {
            Cookie ck = new Cookie(username, password);
            ck.setMaxAge(60 * 60 * 24 * 15); // 15 days
            response.addCookie(ck);
            response.sendRedirect("home.html");
        }
        else
        {
            PrintWriter out = response.getWriter();
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            out.println("<p style=\"color: red !important;\">Invalid user name or password.<p>");
            rd.include(request, response);
            out.close();
        }        
    }
}