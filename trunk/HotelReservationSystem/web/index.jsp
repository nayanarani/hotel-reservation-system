<%-- 
    Document   : index
    Author     : Liu Chun(HTML) Wang Qi Chen(JSP)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*,serv.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <div>
            <table width="1024" border="1">
                <tr>
                    <td colspan="2"><h1>Hotel Reservation System</h1> <a href="adminlogin.jsp">admin login</a></td>
                </tr>
                <tr>
                    <td colspan="2">navigator</td>
                </tr>
                <tr>
                    <td width="200">
                        <%if(session.getAttribute("username")==null && session.getAttribute("adminusername")==null && session.getAttribute("adminroot")==null){%>
                        Welcome Guest<br><a href=login.jsp>Log In</a><br><br><a href="reg.jsp">Register</a>
                        <%}else if(session.getAttribute("username")!=null){%>
                        <%String username = (String)session.getAttribute("username");%>
                        Welcome,<%out.println(username);%><br>
                        <a href=useredit.jsp>Edit my profile</a><br><br>
                        <a href=userorder.jsp>My Order</a><br><br>
                        <a href=logoutserv?action=logout>logout</a>
                        <%} else if(session.getAttribute("adminusername")!=null){ %>
                        <%String adminusername = (String)session.getAttribute("adminusername");%>
                        Welcome,<%out.println(adminusername);%><br>
                        <a href=index.jsp>add room</a><br><br>
                        <a href=index.jsp>add room group</a><br><br>
                        <a href=index.jsp>edit room</a><br><br>
                        <a href=index.jsp>edit room group</a><br><br>
                        <a href=index.jsp>delete room</a><br><br>
                        <a href=index.jsp>delete room group</a><br><br>
                        <a href=logoutserv?action=logout>logout</a>
                        <%} else if(session.getAttribute("adminroot")!=null){ %>
                        <%String adminroot = (String)session.getAttribute("adminroot");%>
                        Welcome,<%out.println(adminroot);%><br>
                        <a href=index.jsp>add admin</a><br><br>
                        <a href=index.jsp>edit admin</a><br><br>
                        <a href=index.jsp>delete admin</a><br><br>
                        <%}%>
                        </td>
                    <td width="808" height="300">
                        <table border="1" width="80%">
                            <%Vector<String[]> v = database.getGroup();
                                        for (String[] s : v) {%>
                            <tr><td><%=s[1]%></td></tr>
                            <tr>
                                <td>
                                    <%=s[2]%>
                                </td>
                                <td>
                                    <a href=listserv?action=list&&groupid=<%=s[0]%>>reservation a room!>></a>
                                </td>
                            </tr>
                            <%}%>
                        </table>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
