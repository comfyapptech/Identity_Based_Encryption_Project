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
                width:80%;
                height:300px;
                background-image: url('Images/wel1.jpg');
                background-repeat: no-repeat;
                background-size: 1200px 300px;
                color:white;
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
                    <a href="pkg_home.jsp">PKG HOME</a>
                </td>
                <td>
                     <a href="outsource_key.jsp">OUTSOURCE KEY</a>
                </td>
                <td>
                     <a href="private_key.jsp">PRIVATE KEY</a>
                </td>
                <td>
                    <a href="logout.jsp"> LOGOUT</a>
                </td>
            </tr>
        </table>
        <hr>
        <%
        HttpSession se= request.getSession();
        String pkg_user=(String)se.getAttribute("pkg_user");
        String password =(String)se.getAttribute("password");
        out.println("<h2>Welcome: "+pkg_user+"</h2>");
        %>
        <div class="abs">
            <div class="welcome">.<br>.
            
            
            
            
            </div>
        </div>
        <hr>
        <div class="footer">
            
        </div>
    </center>
    </body>
</html>