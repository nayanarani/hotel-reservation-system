package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class useredit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("        <script language=\"Javascript\">\r\n");
      out.write("            function checkpassword(){\r\n");
      out.write("       if(document.useredit.oldpassword.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input your current password!\");\r\n");
      out.write("         useredit.oldpassword.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("\r\n");
      out.write("       if(document.useredit.newpassword.value==\"\")\r\n");
      out.write("       {\r\n");
      out.write("         alert(\"please input your new password!\");\r\n");
      out.write("         useredit.oldpassword.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("       }\r\n");
      out.write("            }\r\n");
      out.write("         function checkinformation(){\r\n");
      out.write("             \r\n");
      out.write("         }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div align=\"center\"><fieldset><legend>change your password</legend>\r\n");
      out.write("            <table width=\"300\" border=\"0\">\r\n");
      out.write("                <form name=\"changepassword\" action=\"changepasswordserv\" method=\"post\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">old password:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"oldpassword\" id=\"oldpassword\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">new password:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"newpassword\" id=\"newpassword\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"changepassword\">\r\n");
      out.write("                            <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\" onclick=\"checkPassword()\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr></form>\r\n");
      out.write("            </table>\r\n");
      out.write("        </fieldset>\r\n");
      out.write("          <fieldset><legend>change your information</legend>\r\n");
      out.write("            <table width=\"300\" border=\"0\">\r\n");
      out.write("                <form name=\"changeinfo\" action=\"changeinfoserv\" method=\"post\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">real name:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"realname\" id=\"realname\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">gender:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <select name=\"gender\" id=\"gender\">\r\n");
      out.write("                                <option>male</option>\r\n");
      out.write("                                <option>female</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"label\">\r\n");
      out.write("                    <td>email:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td id=\"label\">telephone:</td>\r\n");
      out.write("                    <td><label>\r\n");
      out.write("                            <input type=\"text\" name=\"telephone\" id=\"telephone\">\r\n");
      out.write("                        </label></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <label>\r\n");
      out.write("                        <input type=\"hidden\" name=\"action\" value=\"changeinfo\">\r\n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\"></label>\r\n");
      out.write("                    <label>\r\n");
      out.write("                      <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("                    </label></td>\r\n");
      out.write("                </tr></form>\r\n");
      out.write("            </table></fieldset>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
