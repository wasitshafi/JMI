<!DOCTYPE html>
<html>
    <head>
        <title>JSP || Local Variables || Global Variables</title>
    </head>
    <body>
        <h2>Please refresh the page several times.</h2>
        <h5>You can try to open this in other browers now, close tab and reopen the closed tab to see magic.</h5><hr/><br/><br/>
                        <!-- Declaration Tag -->
        <%! 
            Integer globalVar = 0;
            int square(int x)
            {
                return x * x;
            }
        %>
                        <!-- Scriplet Tag -->
        <%
            Integer localVar = 0;
            out.print("####################### Scriplet Tag ##################");
            out.println("<p>Value of localVar is  : <b> " + (localVar++) + "</b></p>");
            out.println("<p>Value of globalVar is : <b> " + (globalVar)  + "</b></p>");
            out.println("###################################################");
        %>
                        <!-- CTM : we can't access local variable here --> 
        <p>Value of Global Variable is : <b><%=globalVar++%></b></p>
        <p>Square of <%=globalVar%> is : <b><%=square(globalVar)%></b></p>
    </body>
</html>