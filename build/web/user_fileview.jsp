<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
                margin-top:200px;
                
                
            }
            .welcome
            {
                width:80%;
                height:300px;
            }
            .innerdiv
            {
                border: 1px solid black;
                border-radius: 20px;
                width:400px;
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
       String query="select email,file_name,upload_date from userfile";
       Statement pst=con.createStatement();
       ResultSet rs=pst.executeQuery(query);
       %>
       
        <hr>
        <div style="border:2px solid green; height:400px;border-radius:30px; background-image:url('Images/encrypt.jpg');background-size: 1350px 400px;background-repeat: no-repeat; ">
            
            <div class="innerdiv">
                 <h2 style="color:white;">Uploaded Files</h2>
                <table style="text-align:center;color:white;width:100%;border:2px solid white; border-radius:12px; ">
                    <tr><td>User Email</td><td>File Name</td><td>Uploaded on Date </td></tr>
                    <%
                    while(rs.next())
                    {
                        out.println("<tr style='background-color:grey;'><td>"+rs.getString(1)+"</td><td> "+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
                    }
       %>
                </table>
            </div>
            
                  
                    
                
               
            .
        </div>
        
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>