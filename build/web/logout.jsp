<%-- 
    Document   : logout
    Created on : Mar 5, 2016, 10:33:24 PM
    Author     : Prabhunath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>logout!!</h1>
        <%
        HttpSession se= request.getSession();
        se.invalidate();
        response.sendRedirect("index.html");
        
        %>
    </body>
</html>
