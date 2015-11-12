<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Address</title>
  </head>
  <a href="CustomerRegister.jsp"></a>
  <h1>Register Address and Personal Information</h1>
    <form method="POST" action="CustomerServlet">
        First Name:     <input type="text" name="firstName"/><br/>
        Last Name:      <input type="text" name="lastName"/><br/>
        Street Address: <input type="text" name="street"/><br/>
        City:           <input type="text" name="city"/><br/>
        State:          <input type="text" name="usState"/><br/>
        Zipcode:        <input type="text" name="zipcode"><br/>
        Phone Number:   <input type="text" name="phone"/><br/>
        Email:          <input type="text" name="email"/><br/>
     <input type="submit" value="Click"/>
    </form>
  </body>
</html>
