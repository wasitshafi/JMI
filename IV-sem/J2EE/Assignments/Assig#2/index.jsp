<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="main.css"/>
</head>
<body>
	<%
		Cookie[] cks = request.getCookies();
        if(cks != null)
            for(Cookie ck : cks)
                if(ck.getName().equals("wasit") && ck.getValue().equals("123")) response.sendRedirect("home.html");
    %>
    <div class="main-container">
        <form method="get" action="authentication" class="login-from">
            <table>
				<tr>
					<td><label for="username">Username</label></td>
					<td><input type="text" name="txtbUsername"/></td>
				</tr>
				<tr>
					<td><label for="password">Password</label></td>
					<td><input type="password" name="txtbPassword"/></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center;"><input type="submit" name="login" value="Login"/></td>
				</tr>
			</table>
        </form>
    </div>
</body>
</html>