<%-- 
    Document   : adminorderdetail
    Created on : 2010-5-2, 15:27:16
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
 <head>
   <title>order detail</title>
 </head>
 <body>
   <%Vector<String[]> ListDetail =
     (Vector<String[]>)request.getAttribute("ListDetail");
    String orderid =(String)request.getAttribute("orderid");%>
    <br><center>order:<%= orderid %></center><br>
   <table>
	 <tr>
	   <th>ID</th>
           <th>type</th>
           <th>starttime</th>
	   <th>endtime</th>
           <th>statue</th>
	  </tr>
	   <%
	  	 for(int i=0;i<ListDetail.size();i++){
		   String[] s = ListDetail.get(i);%>
     <tr>
	   <td><%= s[0] %></td>
	   <td><%= s[4] %></td>
	   <td><%= s[1] %></td>
	   <td><%= s[2] %></td>
	   <td><%= s[3] %></td>
	</tr><%}%>
   </table>
 </body>
</html>
