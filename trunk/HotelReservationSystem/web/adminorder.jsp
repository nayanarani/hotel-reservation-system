<%-- 
    Document   : adminorder
    Author     : Tang Wanjian Wang Qichen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
   <title>manage order</title>
   <script language="JavaScript" type="text/javascript">
    function check()
    {
       if(document.searchOrder.orderid.value=="")
       {
         alert("please input the order ID");
         searchOrder.orderid.focus();
         return false;
       }
       document.searchOrder.submit();
    }
   </script>
  </head>
 <body>
   <br>
   <table>
    <tr>
       <td><a href=orderserv?action=allOrders&&condition=1>All of the order</a></td>
	   <td><a href=orderserv?action=allOrders&&condition=2>excuted</a></td>
	   <td><a href=orderserv?action=allOrders&&condition=3>not accept yet</a></td>

	   <td>order ID:
            <form name="searchOrder" action="orderserv" method="post">
	    <input type="hidden" name="action" value="query">
	    <input type="text" name="orderid">
	    <input type="button" value="query" onclick="check()">
            </form>

	   </td>
	  </tr>

   </table><br>
	   <%Vector<String[]> order =
          (Vector<String[]>)request.getAttribute("order");
       if(order==null||order.size()==0){
	     out.println("<center>");
	     out.println("<font color=red size=5>no order</font>");
	     out.println("<br><br><a href="+
	       "orderserv?action=allOrders&&condition=1>return</a></center>");
	    }
	    else{%>
   <table>
	 <tr>
	   <th>ID</th>
           <th>user</th>
           <th>submit time</th>
	   <th>status</th>
           <th>excute admin</th>
           <th>detail</th>
	   <th>PS</th>
           <th>excute order</th>
	 </tr>
	   <%
	  	 for(int i=0;i<order.size();i++){
		   String[] s = order.get(i);%>
     <tr>
	   <td><%= s[0] %></td>
           <td><%= s[1] %></td>
	   <td><%= s[2] %></td>
           <td><%= s[4] %></td>
	   <td><%= s[3] %></td>
	   <td>
	    <a target="blank" href=orderserv?action=ListDetail&&orderid=<%= s[0] %>>order detail</a>
	   </td>
	   <form action="orderserv" method="post">
	   <td>
	      <input type="text" name="reason" size="10" value=<%= s[5] %>>
	   </td><td align="center">
	     <select name="status">
	     <option selected>successd</option>
	     <option>failed</option>
	     <option>waiting for apply</option>
	     </select>
	     <input type="hidden" name="action" value="dealOrder">
	     <input type="hidden" name="orderid" value=<%= s[0] %>>
	     <input type="submit" value="submit">

	   </td>
	   	</form>
	</tr> <%}%>
   </table><%}%>
 </body>
</html>