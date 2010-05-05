package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class roomgrouplist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
 Vector<String> list = (Vector<String>) session.getAttribute("list");
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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Rservation list for ");
      out.print(groupname);
      out.write("</title>\r\n");
      out.write("        <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><div align=\"center\">\r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    \t<td>\r\n");
      out.write("        <table border=\"1\" align=\"center\">\r\n");
      out.write("            <tr bgcolor=\"#666666\">\r\n");
      out.write("                <th id=\"thlabel\">Room</th>\r\n");
      out.write("                <th id=\"thlabel\">type</th>\r\n");
      out.write("                <th id=\"thlabel\">price</th>\r\n");
      out.write("                <th id=\"thlabel\">discribe</th>\r\n");
      out.write("                <th id=\"thlabel\">statue</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 Vector<String[]> v = serv.database.getPageContent(currPage, span, group);
                        int totalPage = serv.database.getTotal(span, group);
                        for (String[] s : v) {
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(s[0]);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(s[1]);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(s[2]);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(s[3]);
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <a target=\"blank\" href=listserv?action=status&&roomname=");
      out.print( s[0]);
      out.write(">Look</a>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <table align=\"center\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ");
if (currPage > 1) {
      out.write("\r\n");
      out.write("                    <a href=roomgrouplist.jsp?cp=");
      out.print( currPage - 1);
      out.write("><< Lastpage</a>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("                <td align=\"center\"><br>\r\n");
      out.write("                    <form action=roomgrouplist.jsp method=\"post\">\r\n");
      out.write("                        <select name=\"cp\" onChange=\"this.form.submit();\">\r\n");
      out.write("                            ");
 for (int i = 1; i <= totalPage; i++) {
                                                            String select = "";
                                                            if (i == currPage) {
                                                                select = "selected";
                                                            }
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print( i);
      out.write('"');
      out.write(' ');
      out.print( select);
      out.write(">page:");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("                <td>\r\n");
      out.write("                    ");
if (currPage < totalPage) {
      out.write("\r\n");
      out.write("                    <a href=roomgrouplist.jsp?cp=");
      out.print( currPage + 1);
      out.write(">nextpage>></a>\r\n");
      out.write("                    ");
}
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <font>\r\n");
      out.write("\t\t\treservation rules for ");
      out.print( groupname);
      out.write(":<br>\r\n");
      out.write("\t\t\t1.please input correct reservation time<br>\r\n");
      out.write("\t\t\t2.please check out the information about the room<br>\r\n");
      out.write("\t\t\t3.");
      out.print( gOrderDet);
      out.write("\r\n");
      out.write("                    </font>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <table>\r\n");
      out.write("            <form name=\"order\" action=\"orderserv\" method=\"post\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">Room:</td><td>\r\n");
      out.write("                        <select name=\"orderNum\">\r\n");
      out.write("                            ");
for (String[] s : v) {
                                                            if (serv.orderdatabase.isOrdered(s[0])) {
                                                                continue;
                                                            }
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print( s[0]);
      out.write("</option>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">Group:</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <textarea name=\"group\" readonly=\"readonly\">");
      out.print( groupname);
      out.write("</textarea>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
Date now = new Date();
                                            int year = now.getYear() + 1900;
                                            int month = now.getMonth() + 1;
                                            int day = now.getDate();
                                            int hour = now.getHours();
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">\r\n");
      out.write("  \t  start time:\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"startyear\">\r\n");
      out.write("                            <option selected>");
      out.print(year);
      out.write("</option>\r\n");
      out.write("                            <option>");
      out.print(year + 1);
      out.write("</option>\r\n");
      out.write("                        </select>year\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"startmonth\">\r\n");
      out.write("                            ");

                                                        for (int i = 1; i < 13; i++) {
                                                            if (i != month) {
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        }
                            
      out.write("\r\n");
      out.write("                            ");

                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>month\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"startday\">\r\n");
      out.write("                            ");

                                                        for (int i = 1; i < 32; i++) {
                                                            if (i != day) {
      out.write("\r\n");
      out.write("                            <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                            }
                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>day\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"starthour\">\r\n");
      out.write("                            ");

                                                        for (int i = 0; i < 24; i++) {
                                                            if (i != hour) {
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print(i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                            }
                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>hour\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">\r\n");
      out.write("  \t  finish time:\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"finishyear\">\r\n");
      out.write("                            <option selected>");
      out.print( year);
      out.write("</option>\r\n");
      out.write("                            <option>");
      out.print( year + 1);
      out.write("</option>\r\n");
      out.write("                        </select>Year\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"finishmonth\">\r\n");
      out.write("                            ");

                                                        for (int i = 1; i < 13; i++) {
                                                            if (i != month) {
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                            }
                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>month\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"finishday\">\r\n");
      out.write("                            ");

                                                        for (int i = 1; i < 32; i++) {
                                                            if (i != day) {
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                            }
                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>day\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"finishhour\">\r\n");
      out.write("                            ");

                                                        for (int i = 0; i < 24; i++) {
                                                            if (i != hour) {
                            
      out.write("\r\n");
      out.write("                            <option>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                                                        } else {
                            
      out.write("\r\n");
      out.write("                            <option selected>");
      out.print( i);
      out.write("</option>\r\n");
      out.write("                            ");

                                                            }
                                                        }
                            
      out.write("\r\n");
      out.write("                        </select>hour\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td></td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"add\">\r\n");
      out.write("                        <input type=\"submit\" name=\"add\" value=\"add to order\">\r\n");
      out.write("                    <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </form>\r\n");
      out.write("        </table>\r\n");
      out.write("        </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
