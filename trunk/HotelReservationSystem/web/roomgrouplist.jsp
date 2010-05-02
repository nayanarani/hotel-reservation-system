<%--
    Document   : roomgrouplist
    Author     : Wang Qi Chen
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.*"%>

<% Vector<String> list = (Vector<String>) session.getAttribute("list");
            int group = Integer.parseInt(list.get(0));
            String groupname = list.get(1);
            String gOrderDet = list.get(2);
            String cpStr = request.getParameter("cp");
            String title = groupname + "List";
            int currPage = 1;
            if (cpStr != null) {
                currPage = Integer.parseInt(cpStr.trim());
            }
            int span = 5;
%>
<html>
    <head>
        <title>Rservation list for <%=groupname%></title>
    </head>
    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>type</th>
                <th>price</th>
                <th>discribe</th>
                <th>statue</th>
            </tr>
            <% Vector<String[]> v = serv.database.getPageContent(currPage, span, group);
                        int totalPage = serv.database.getTotal(span, group);
                        for (String[] s : v) {%>
            <tr>
                <td><%=s[0]%></td>
                <td><%=s[1]%></td>
                <td><%=s[2]%></td>
                <td><%=s[3]%></td>
                <td>
                    <a target="blank" href=listserv?action=status&&groupname=<%= s[0]%>>Look</a>
                </td>
            </tr>
            <%}%>
        </table>
        <table>
            <tr>
                <td>
                    <%if (currPage > 1) {%>
                    <a href=roomgrouplist.jsp?cp=<%= currPage - 1%>><< Lastpage</a>
                    <%}%>
                </td>

                <td align="center"><br>
                    <form action=roomgrouplist.jsp method="post">
                        <select name="cp" onchange="this.form.submit();">
                            <% for (int i = 1; i <= totalPage; i++) {
                                                            String select = "";
                                                            if (i == currPage) {
                                                                select = "selected";
                                                            }%>
                            <option value="<%= i%>" <%= select%>>page:<%= i%></option>
                            <%}%>
                        </select>
                    </form>
                </td>

                <td>
                    <%if (currPage < totalPage) {%>
                    <a href=roomgrouplist.jsp?cp=<%= currPage + 1%>>nextpage>></a>
                    <%}%>
                </td>
            </tr>
        </table>
        <table>
            <tr>
                <td>
                    <font>
			reservation rules for <%= groupname%><br>
			1.<br>
			2.<br>
			3.<%= gOrderDet%>
                    </font>
                </td>
            </tr>
        </table>
        <table>
            <form name="order" action="orderserv" method="post">
                <tr>
                    <td>ID:</td><td>
                        <select name="orderNum">
                            <%for (String[] s : v) {
                                                            if (serv.orderdatabase.isOrdered(s[0])) {
                                                                continue;
                                                            }
                            %>
                            <option><%= s[0]%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Group:</td>
                    <td>
                        <textarea name="group" readonly="readonly"><%= groupname%></textarea>
                    </td>
                </tr>
                <%Date now = new Date();
                                            int year = now.getYear() + 1900;
                                            int month = now.getMonth() + 1;
                                            int day = now.getDate();
                                            int hour = now.getHours();
                %>
                <tr>
                    <td>
  	  start time:
                    </td>
                    <td>
                        <select name="startyear">
                            <option selected><%=year%></option>
                            <option><%=year + 1%></option>
                        </select>year

                        <select name="startmonth">
                            <%
                                                        for (int i = 1; i < 13; i++) {
                                                            if (i != month) {
                            %>
                            <option><%=i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%=i%></option>
                            <%
                                                                                        }
                            %>
                            <%
                                                        }
                            %>
                        </select>month

                        <select name="startday">
                            <%
                                                        for (int i = 1; i < 32; i++) {
                                                            if (i != day) {%>
                            <option><%=i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%=i%></option>
                            <%
                                                            }
                                                        }
                            %>
                        </select>day

                        <select name="starthour">
                            <%
                                                        for (int i = 0; i < 24; i++) {
                                                            if (i != hour) {
                            %>
                            <option><%=i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%=i%></option>
                            <%
                                                            }
                                                        }
                            %>
                        </select>hour
                    </td>
                </tr>
                <tr>
                    <td>
  	  finish time:
                    </td>
                    <td>
                        <select name="finishyear">
                            <option selected><%= year%></option>
                            <option><%= year + 1%></option>
                        </select>Year

                        <select name="finishmonth">
                            <%
                                                        for (int i = 1; i < 13; i++) {
                                                            if (i != month) {
                            %>
                            <option><%= i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%= i%></option>
                            <%
                                                            }
                                                        }
                            %>
                        </select>month

                        <select name="finishday">
                            <%
                                                        for (int i = 1; i < 32; i++) {
                                                            if (i != day) {
                            %>
                            <option><%= i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%= i%></option>
                            <%
                                                            }
                                                        }
                            %>
                        </select>day

                        <select name="finishhour">
                            <%
                                                        for (int i = 0; i < 24; i++) {
                                                            if (i != hour) {
                            %>
                            <option><%= i%></option>
                            <%
                                                                                        } else {
                            %>
                            <option selected><%= i%></option>
                            <%
                                                            }
                                                        }
                            %>
                        </select>hour
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="hidden" name="action" value="add">
                        <input type="submit" name="add" value="add to order">
                        <a href="index.jsp">return</a>
                    </td>
                </tr>
            </form>
        </table>
    </body>
</html>