/**
  @author wasitshafi
  @since  15-03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class Cookies extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        PrintWriter out = response.getWriter();
        StringBuilder sb = new StringBuilder();
        String name = "wasitShafi"; // can't have special characters like ?\[]@=: etc
        String value = "MCA054";
        
        Cookie cookie = new Cookie("wasitShafi", "MCA054"); // name, value
        cookie.setMaxAge(60 * 60  *  24 * 365); // arguments in seconds, 60 * 60  *  24 * 365 == 1yr 
        response.addCookie(cookie);

        Cookie cookies[] = request.getCookies();
        if(cookies == null)
        {
            sb.append("No Cookies found.");
        }
        else
        {
            int len = cookies.length;
            sb.append("Name : Value : Comment : Domain : MaxAge : Path : Secure : Version<br/>");
            for(int i = 0 ; i < len ; i++) sb.append(cookies[i].getName() + " : " + cookies[i].getValue( ) + " : " + cookies[i].getComment() + " : " + cookies[i].getDomain() + " : " + cookies[i].getMaxAge() + " : " + cookies[i].getPath() + " : " + cookies[i].getSecure() + " : " + cookies[i].getVersion() + "<br/>");
            // there are several mutators like setDomain(String Pattern), setComment(String Purpose), setMaxAge(int expity), setSecure(Boolean flag), setVersion(int v)...
        }

        response.setContentType("text/html");
        out.println("<!DOCTYPE html>" +
        "<html>" +
        "<head>" +
            "<title>Welcom to J2EE...!</title>" +
        "</title>" +
        "<body>" +
        "<b style='color:Tomato; text-align:center; display:block; font:bold 30px Comic Sans MS;'>addCookie() & getCookie() Demo</b>" +
        "<p style='color:Tomato; text-align:center; display:block; font:bold 15px Comic Sans MS;'>" + sb + "</p>" +
        "</body>" +
        "</html>");
        out.close();
    }
}