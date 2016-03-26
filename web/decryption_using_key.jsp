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
                width:1200px;
            }
        </style>
    <body>
    <center>
        <div class="head">
            <h2>Identity Based Encryption using KU-CSP</h2>
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
       String Email=(String)se.getAttribute("u_email");
       String fname=(String)se.getAttribute("file_name");
       se.setAttribute("u_email",Email);
       se.setAttribute("file_name",fname);        
       out.println("<hr>Email: "+Email+"<hr>Key Sent For File Name: "+fname);
       %>
       
        <hr>
        <div style="border:2px solid green; height:400px;border-radius:30px; background-image:url('Images/encrypt.jpg');background-size: 1350px 400px;background-repeat: no-repeat; ">
            <div class="innerdiv" style="display:table;">
                 <h2 style="color:white;">Enter Key </h2>
            </td>
              <td>    
                   
                <table style="background-color:white;color:red;opacity: 0.6; ">
                    <form method="POST" action="DecryptData">
                        <tr>
                            <td>Enter Private Key Sent to your Mail:</td> <td><input style="background-color:white;" type="text" name="private_key"></td>
                             </tr>
                              
                              <tr>
                                  <td></td> <td><input type="submit" value="Submit Key!!"></td>
                        </tr>
                            
                        
                    </form>
                </table>  
              </td>
                     </tr>
                 
               </div>
            .
        </div>
        
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>