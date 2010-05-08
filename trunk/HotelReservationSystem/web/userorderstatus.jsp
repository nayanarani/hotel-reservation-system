<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
 <head>
   <title>orderstatus</title>
    <link href="css/styleHRS.css" type="text/css" rel="stylesheet">
 </head>
 <body>
   <%Vector<String[]> list = (Vector<String[]>)request.getAttribute("list");
    if(list==null||list.size()==0){
      out.println("<center>");
      out.println("<font>you have not order yet</font>");
      out.println("<br><br><a href=index.jsp>return");
    }else{%>
  <table>
	 <tr>
	   <th>ID</th>
           <th>user</th>
	   <th>ordertime</th>
           <th>status</th>
	   <th>execute admin</th>
           <th>Details</th>
           <th>PS</th>
	 </tr>
	   <%int color = 0;
	  	 for(int i=0;i<list.size();i++){
		   String[] s = list.get(i);%>
     <tr>
	   <td align="center"><%= s[0] %></td>
           <td align="center"><%= s[1] %></td>
	   <td align="center"><%= s[2] %></td>
           <td align="center"><%= s[4] %></td>
	   <td align="center"><%= s[3] %></td>
	   <td align="center">
	    <a target="blank" href=orderserv?action=ListDetail&&orderid=<%= s[0] %>>order detail</a>
	   </td>
	   <td align="center"><%= s[5] %></td>
	</tr><%}%>
   </table><%}%>
 </body>
