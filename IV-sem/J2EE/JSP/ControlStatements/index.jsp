<!DOCTYPE html>
<html>
    <head>
        <title>Control Statements in JSP</title>
    </head>
    <body>
        <%
            out.print("JSP is so simple, it doesn't require deployment descriptor<br/>");
            out.print("Servlets : writing HTML code in JAVA.<br/>");
            out.print("JSP : writing JAVA code in HTML.<br/>");
            out.print("Press 'ctrl + u' => to view page source<br/>");
        %>

        <%! String name = "Wasit shafi"; %>
        <% if(1 > 2) { %>
            <p> One is Greater Than Two</p>
        <% } else { %>
            <p> one is not Greater Than Two</p>
        <% } %>


        <% for( int i = 0 ; i < 10 ; i++) { %>
                <p>i : <%=i%></p>
        <% } %>

        <p> My Name is <%=name%>.</p>


    </body>
</html>