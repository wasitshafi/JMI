/* Write a J2EE Program which takes personal details (Name, Age, Sex, DoB, Address, etc), academic details 
   (Schools, College, University, etc) and Experience details as input through a well-designed web-form.
   On the submission of this form, a servlet is invoked which formats and displays these information in a tabular/printable form.
*/
/**
  @author wasitshafi
  @since  20-03-2020
*/
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDetailsServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter out = response.getWriter();
        
        response.setContentType("text/html");
        out.println("<!DOCTYPE html>" +
        "<html>" +
            "<head>" +
                "<title>View User Details</title>" +
                "<link rel=\"stylesheet\" href=\"CSS/main.css\">" +
            "</head>" +
        "<body>" +
        "<div class=\"main-container\">" +
            "<table>" +
                "<tr>" +
                "<td colspan=\"2\"><p class=\"main-heading\">Personal Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Name</td>" +
                    "<td>" + request.getParameter("txtbName") + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Age</td>" +
                    "<td>" + request.getParameter("txtbAge")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>D.O.B</td>" +
                    "<td>" + request.getParameter("txtbDob")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Contact No.</td>" +
                    "<td>" + request.getParameter("txtbContactNo")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Email-ID</td>" +
                    "<td>" + request.getParameter("txtbEmailId")  + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td colspan=\"2\"><p class=\"main-heading\">Academic Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td colspan=\"2\"><p class=\"main-heading__sub-heading\">10<sup class=\"main-heading__sub-heading\">th</sup> Class Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Board Name</td>" +
                    "<td>" + request.getParameter("10thBoardName")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Roll No</td>" +
                    "<td>" + request.getParameter("10thRollno")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Year of Passing</td>" +
                    "<td>" + request.getParameter("10thYearOfPassing")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Percentage</td>" +
                    "<td>" + request.getParameter("10thPercentage")  + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td colspan=\"2\"><p class=\"main-heading__sub-heading\">12<sup class=\"main-heading__sub-heading\">th</sup> Class Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Board Name</td>" +
                    "<td>" + request.getParameter("12thBoardName")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Roll No</td>" +
                    "<td>" + request.getParameter("12thRollno")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Year of Passing</td>" +
                    "<td>" + request.getParameter("12thYearOfPassing")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Percentage</td>" +
                    "<td>" + request.getParameter("12thPercentage")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td colspan=\"2\"><p class=\"main-heading__sub-heading\">UG Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Board Name</td>" +
                    "<td>" + request.getParameter("ugBoardName")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Roll No</td>" +
                    "<td>" + request.getParameter("ugRollno")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Year of Passing</td>" +
                    "<td>" + request.getParameter("ugYearOfPassing")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Percentage</td>" +
                    "<td>" + request.getParameter("ugPercentage")  + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td colspan=\"2\"><p class=\"main-heading\">Work Experience Details</p></td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Company</td>" +
                    "<td>" + request.getParameter("txtbOrganizaion")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Job Profile</td>" +
                    "<td>" + request.getParameter("txtbProfile")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Experience</td>" +
                    "<td>" + request.getParameter("txtbExperience")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Location</td>" +
                    "<td>" + request.getParameter("txtbLocation")  + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td colspan=\"3\" style=\"text-align: center; padding-top: 10px;\">" +
                    "<input type=\"button\" value=\"print\" name=\"btnName\" onclick=\"window.print();return false;\">" +
                    "</td>" +
                "</tr>" +
            "</table>" +
            "</div>" +
        "</body>" +
        "</html>");
        out.close();
    }
}