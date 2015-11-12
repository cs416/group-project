<%-- 
    Document   : LogIn
    Created on : Nov 12, 2015, Nov 12, 2015 9:27:42 AM
    Author     : Ems
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
    <body>
     <h1> Please Sign up </h1>
    <form method="POST" action="SignUpServlet">
      Customer ID: (Use Email Address)  <input type="text" name="logInID"/><br/>
      Password :                        <input type="text" name="password"/><br/>
                                        <input type="submit" value="Click"/>
    </form>
    </body>
</html>
