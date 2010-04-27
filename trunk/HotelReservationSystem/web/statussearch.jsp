<%-- 
    Document   : statussearch
    Author     : Liu Chun Wang Qichen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <%Vector<String[]> v = (Vector<String[]>) request.getAttribute("v");
                 String title = "No." + (String) request.getAttribute("roomname");
                 String isOrdered = (String) request.getAttribute("isOrdered");%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>statues of <%=title%></title>
    </head>
    <body>
        <% if (isOrdered.trim().equals("YES")) {
                        out.println("<center>");
                        out.println("<font color=red size=5>sorry,this room has been reserved.<br><br><br>");
                        out.println("<a href=roomgrouplist.jsp>return?");
                        out.println("</center>");
                    } else {
                        if (v.size() == 0) {
                            out.println("<center>");
                            out.println("<font color=red size=5>no order<br><br><br>");
                            out.println("<a href=roomgrouplist.jsp>return");
                            out.println("</center>");
                } else {%>
        <table>
            <tr>
                <th>start time</th>  <th>end time</th> <th>status</th>
            </tr>
            <%for (String s[] : v) {%>
            <tr>
                <td><%= s[0]%></td> <td align="center"><%= s[1]%></td>
                <td>has been reserved</td>
            </tr><%}%>
        </table><%}
                }%>
    </body>
</html>
