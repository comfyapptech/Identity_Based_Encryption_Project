<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<html>
    <style>
            .head{
                border: 2px solid green;
                border-radius:20px;
                width:80%;
                text-align:center;
                background-color:green; 
            }
            .abs{
                border: 2px solid green;
                border-radius: 30px;
            }
            .tbl td
            {
                padding: 20px;
            }
            .footer
            {
                width:100%;
                height:30px;
                border:1px solid white;
                background-color:green;
                margin-top:20px;
                
                
            }
            .welcome
            {
                width:100%;
                height:300px;
                background-color:green;
                background-image: url('Images/wel2.jpg'); 
                background-repeat: no-repeat; 
                background-size:1350px 300px;
            }
        </style>
    <body>
    <center>
        <div class="head">
            <h2>Identity-Based Encryption with Outsourced Revocation in Cloud Computing</h2>
        </div>
        <table class="tbl">
            <tr>
                <td>
                    <a href="user_profile.jsp">USER HOME</a>
                </td>
                <td>
                     <a href="upload.jsp">UPLOAD </a>
                </td>
                <td>
                    <a href="user_fileview.jsp">FILE VIEW</a>
                </td>
                <td>
                    <a href="logout.jsp"> LOGOUT</a>
                </td>
            </tr>
        </table>
        <%
       Class.forName("com.mysql.jdbc.Driver");
       HttpSession se=request.getSession();
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ibeorcc","root","password");
       String email=(String)se.getAttribute("User_Email");
       out.println("<h3>Welcome @"+email+"</h3>");
       String password=(String)se.getAttribute("User_Password");
       String query="select * from users where email='"+email+"' and password='"+password+"'";
       Statement pst=con.createStatement();
       ResultSet rs=pst.executeQuery(query);
       
        %>
        <hr>
        <div class="abs">
            <div class="welcome"><p style='color:white;'>WELCOME TO USER PROFILE</p>
            
            
            
            <%
            while(rs.next())
            {
                out.println("<h2 style='color:red;'>Name:'"+rs.getString(1)+"' </h2>");
            }
            
            %>
            
            </div>
        </div>
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>