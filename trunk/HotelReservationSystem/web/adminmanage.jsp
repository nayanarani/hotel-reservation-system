<%-- 
    Document   : adminmanage
    Created on : 2010-5-1, 16:41:31
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <html>
  <head>
   <title>manage admin</title>
  </head>
 <body>

<br>
    <table>
     <tr>
      <td><a href=adminadd.jsp>addadmin</a></td>
      <td><a href=adminedit.jsp>edit admin</a></td>
     </tr>
    </table><br><br>
    <%
       Vector<String []> vadmin = serv.database.getAdminInfo();
     %>
    <table>
     <tr>
       <th>adminID</th>
       <th>adminlevel</th>
       <th>delete</th>
     </tr>
      <%
      for(String []s:vadmin)
      {
     %>
      <tr>
        <td><%= s[0] %></td>
        <%
        if(s[1].equals("root"))
        {
        %>
        <td>root</td>
        <%
        }
        else
        {
         %>
        <td>advanced</td>
        <% } %>
        <td>
         <a href=admindelserv?action=deladmin&&adminusername=<%= s[0] %>>delete</a>
        </td>
       </tr>
     <%
       }
      %>
    </table>
 </body>
</html>
