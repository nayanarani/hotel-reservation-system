package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import serv.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Index</title>\r\n");
      out.write("        <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("            <table width=\"1024\" border=\"0\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"center\" height=\"100\" colspan=\"2\"><img src=\"image/logo.jpg\" width=\"1020\" height=\"150\" alt=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"sidebar\" width=\"200\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("                        ");
if(session.getAttribute("username")==null && session.getAttribute("adminusername")==null && session.getAttribute("adminroot")==null){
      out.write("\r\n");
      out.write("       <table width=\"200\" align=\"center\"><tr><td id=\"navigator\"><strong>Welcome, Guest :<br>\r\n");
      out.write("       </strong></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=login.jsp>Sign in</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=\"reg.jsp\">Sign up</a></td></tr></table>\r\n");
      out.write("                    ");
}else if(session.getAttribute("username")!=null){
      out.write("\r\n");
      out.write("                        ");
String username = (String)session.getAttribute("username");
      out.write("\r\n");
      out.write("                        <table width=\"200\" align=\"center\"><tr><td id=\"navigator\"><strong>Welcome,\r\n");
      out.write("                        ");
out.println(username);
      out.write(" \r\n");
      out.write("                        :</strong></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=useredit.jsp>Edit my profile</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=userorder.jsp>My Order</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=logoutserv?action=logout>Logout</a></td></tr></table>\r\n");
      out.write("\r\n");
      out.write("                    ");
} else if(session.getAttribute("adminusername")!=null){ 
      out.write("\r\n");
      out.write("                        ");
String adminusername = (String)session.getAttribute("adminusername");
      out.write("\r\n");
      out.write("                        <table width=\"200\" align=\"center\"><tr><td id=\"navigator\"><strong>Welcome,\r\n");
      out.write("                        ");
out.println(adminusername);
      out.write("\r\n");
      out.write("                        :</strong></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=listserv?action=adminList&&groupid=0>manage room</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=listserv?action=adminGroup>manage room group</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=orderserv?action=allOrders&&condition=1>manage order</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=logoutserv?action=logout>logout</a></td></tr></table>\r\n");
      out.write("                    ");
} else if(session.getAttribute("adminroot")!=null){ 
      out.write("\r\n");
      out.write("                        ");
String adminroot = (String)session.getAttribute("adminroot");
      out.write("\r\n");
      out.write("                        <table width=\"200\" align=\"center\"><tr><td id=\"navigator\"><strong>Welcome,\r\n");
      out.write("                        ");
out.println(adminroot);
      out.write("\r\n");
      out.write("                        </strong></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=adminmanage.jsp>manage admin</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=adminedit.jsp>edit password</a></td></tr>\r\n");
      out.write("                        <tr><td id=\"menu\"><a href=logoutserv?action=logout>Logout</a></td></tr></table>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                  </td>\r\n");
      out.write("                    <td width=\"808\" height=\"300\">\r\n");
      out.write("                        <table width=\"90%\" height=\"151\" border=\"1\" align=\"center\">\r\n");
      out.write("                            ");
Vector<String[]> v = database.getGroup();
                                        for (String[] s : v) {
      out.write("\r\n");
      out.write("                                        <tr><td align=\"center\" width=\"150\" rowspan=\"2\"><img alt=\"RoomPic\" src=\"");
      out.print(s[4]);
      out.write("\"/></td>\r\n");
      out.write("                       \t\t\t\t\t  <td height=\"30\" >");
      out.print(s[1]);
      out.write("</td>\r\n");
      out.write("                       \t\t\t\t\t  <td width=\"150\" rowspan=\"2\" ><a href=listserv?action=list&&groupid=");
      out.print(s[0]);
      out.write(">reservation a room!>></a></td>\r\n");
      out.write("                       \t\t\t\t\t</tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <td width=\"300\">");
      out.print(s[2]);
      out.write("</td>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                           \r\n");
      out.write("                        </table>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td align=\"center\" colspan=\"2\">\r\n");
      out.write("                <hr>\r\n");
      out.write("                <p>Copy Right by Group 16</p></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
