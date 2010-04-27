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
                    <td colspan="2"><h1>Hotel Reservation System</h1></td>
                </tr>
                <tr>
                    <td colspan="2">navigator</td>
                </tr>
                <tr>
                    <td width="200">
                        <%if(session.getAttribute("username")==null){%>
                        Welcome Guest ( <a href=login.jsp>Log In</a> | <a href="reg.jsp">Register</a>  )
                        <%}else{%>
                        <%String username = (String)session.getAttribute("username");%>
                        Welcome,<%out.println(username);%>
                        <a href=useredit.jsp>Edit my profile</a> | <a href=logoutserv?action=logout>logout</a>
                        <%}%>
                        left side frame</td>
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
                                    <%=s[3]%><a href=listserv?action=list&&groupid=<%=s[0]%>>reservation a room!>></a>
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
