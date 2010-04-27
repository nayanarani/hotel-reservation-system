<%-- 
    Document   : userorder
    Author     : Tang Wan Jian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>user order</title>
    </head>
    <body>
  <%Vector<String[]> OrderList=(Vector<String[]>)session.getAttribute("OrderList");
     if(OrderList==null||OrderList.size()==0){
      out.println("<center>");
      out.println("<font color=red size=5>You have not reserve yet!</font>");
      out.println("<br><br><a href=index.jsp>return");
     }else{%>
   <table>
	 <tr>
	   <th>No</th>
           <th>type</th>
           <th>start time</th>
	   <th>end time</th>
           <th>delete</th>
	 </tr>
	   <%
	  	 for(int i=0;i<OrderList.size();i++){
		     String[] s = OrderList.get(i);%>
     <tr>
	   <td><%=s[0]%></td>
           <td><%=s[1]%></td>
	   <td><%=s[2]%></td>
           <td><%=s[3]%></td>
	   <td><br>
	     <form action="orderserv" name="delete" method="post">
	      <input type="hidden" name="index" value=<%= i %>>
	      <input type="hidden" name="action" value="delete">
	      <input type="submit" value="delete">
	     </form>
	    </td>
	  </tr>
		 <%}%>
	  <tr>
	    <td align="center" colspan="2"><br>
	     <form action="orderserv" name="empty" method="post">
	      <input type="hidden" name="action" value="empty">
	      <input type="submit" value="empty">
	     </form>
	    </td>
	    <td><br>
	      <form action="orderserv" name="submit" method="post">
	       <input type="hidden" name="action" value="submit">
	       <input type="submit" value="submit">
	      </form>
	    </td>
	    <td align="center"><a href="index.jsp">continue>></a></td>
      </tr>
 </table><%}%>
    </body>
</html>
