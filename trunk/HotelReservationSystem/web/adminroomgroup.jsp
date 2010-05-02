<%-- 
    Document   : adminroomgroup
    Author     : Liu Chun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <html>
  <head>
   <title>groupmanage</title>
  </head>
 <body>
    <br>
    <% Vector<String []> vgroup = serv.database.getGroup();
     %>
    <table>
     <tr>
       <th>groupname</th>
       <th>pic</th>
       <th>groupdetails</th>
       <th>grouprules</th>
       <th>Edit/Del</th>
     </tr>
      <%for(String []s:vgroup){%>
      <tr>
        <td><%= s[1] %></td>
        <td><%= s[0] %></td>
        <td><%= s[2] %></td>
        <td><%= s[3] %></td>
        <td>
         <a href=listserv?action=editGroup&&groupid=<%= s[0] %>>edit/del</a>
        </td>
       </tr>
     <%}%>
    </table><br>
    <center><a href=adminaddroomgroup.jsp>addgroup</a></center>
 </body>
</html>
