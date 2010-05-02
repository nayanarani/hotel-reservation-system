<%-- 
    Document   : adminaddroom
    Author     : Liu Chun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 <html>
  <head>
   <title>add room</title>
   <script language="JavaScript" type="text/javascript">
    function checkadminaddroom()
    {
       if(document.addRes.roomname.value=="")
       {
         alert("ID is NULL");
         addRes.roomname.focus();
         return false;
       }
       if(document.addRes.style.value=="")
       {
         alert("style is NULL");
         addRes.style.focus();
         return false;
       }
       if(document.addRes.cost.value=="")
       {
         alert("PRICE IS NULL");
         addRes.cost.focus();
         return false;
       }
       if(document.addRes.details.value=="")
       {
         alert("PS is NULL");
         addRes.details.focus();
         return false;
       }
       document.addRes.submit();
    }
        function check()
    {
       if(document.searchRes.roomname.value=="")
       {
         alert("please input id to serach");
         searchRes.roomname.focus();
         return false;
       }
       document.searchRes.submit();
    }
   </script>
  </head>
 <body>
        <table><form name="searchRes" action="listserv" method="post">
   <tr>
      <td>
        <a target="balnk" href="adminaddroom.jsp">add room</a>
      </td>
      
      <td>id:
	    <input type="text" name="roomname">
	    <input type="button" value="check" onclick="check()">
	    <input type="hidden" name="action" value="queryRes">
	  </td>
   </tr>

    </form>
   </table><br><br><br>
   <table>
    <th>Group</th>
    <tr>
     <td>
      <a href=listserv?action=adminList&&groupid=0>All group</a>
     </td>
    </tr>
    <%
      Vector<String[]> vgroup = serv.database.getGroup();
      for(String[] s:vgroup){%>
    <tr><td>
      <a href=listserv?action=adminList&&groupid=<%=s[0]%>><%= s[1] %></a>
    </td></tr>
     <%}%>
</table>
   <center>
    <font>please input the correct information</font>
   </center><br>
   <table>
    <form name="addRes" action="listserv" method="post">
     <tr>
      <td>room id:</td>
      <td><input type="text" name="roomname"></td>
     </tr>
     <tr>
      <td>room group:</td>
      <td>
       <select name="roomgroup">
		<%
		   for(String s[]:vgroup)
		   {
		 %>
             <option value=<%= s[0] %>><%= s[1] %></option>
   		<%
   		   }
   		 %>
       </select>
      </td>
     </tr>
     <tr>
      <td>style:</td>
      <td><input type="text" name="style"></td>
     </tr>
     <tr>
      <td>cost:</td>
      <td><input type="text" name="cost"></td>
     </tr>
     <tr>
       <td>details:</td>
       <td>
         <textarea rows=4 cols=40 name="details"></textarea>
       </td>
     </tr>
     <tr>
      <td>status:</td>
      <td>
       <select name="status">
        <option>empty</option>
        <option>used</option>
       </select>
      </td>
     </tr>
     <tr><td></td>
      <td align="left">
        <input type="hidden" name="action" value="addRes">
        <input type="submit" value="save" onclick="checkadminaddroom()">
        <input type="reset" value="reset">
       </td>
     </tr>
    </form>
   </table>
 </body>
</html>
