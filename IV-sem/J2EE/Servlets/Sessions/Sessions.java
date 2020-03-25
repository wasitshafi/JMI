/**
  @author wasitshafi
  @since  16-03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Sessions extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        StringBuilder sb = new StringBuilder("");
        HttpSession session = request.getSession();

        if(session == null)
            sb.append("No Session Created Yet...!");
        else
        {
            session.setMaxInactiveInterval(30); // after 30 sec. of inactive time period the session will be invalid
            session.setAttribute("x", "12345"); // created a new attribute 'x' for this session, now it can be accessed by other servles until its not removed or session is not invalid(session.getAttribute(name), session.removeAttribute(name), session.invalidate())
            sb.append("getId() : " + session.getId() + "<br/>" +
            "getCreationTime() : " + session.getCreationTime() + "<br/>" +
            "getLastAccessedTime() : " + session.getLastAccessedTime() + "<br/>" +
            "getMaxInactiveInterval() : " + session.getMaxInactiveInterval() + "<br/>" +
            "isNew() : " + session.isNew() +
            "getAttribute(\"X\") : " + session.getAttribute("x"));
        }
        
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
            "<title>Tracking Sessions...</title>" +
        "</title>" +
        "<body>" +
            "<b style='color:Tomato; font:bold 30px Comic Sans MS;'>" + sb + "</b>" +
        "</body>" +
        "</html>");
        out.close();
        session.invalidate();
        session.removeAttribute("x");
    }
}