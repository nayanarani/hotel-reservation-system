package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminedit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit admin</title>\r\n");
      out.write("        <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("        <script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("            function checkadmininformation() {\r\n");
      out.write("     if(document.adminedit.adminusername.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"please input admin username\");\r\n");
      out.write("         adminedit.adminusername.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("     if(document.adminedit.adminoldpassword.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"please input admin old password\");\r\n");
      out.write("         adminedit.adminoldpassword.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("     if(document.adminedit.adminnewpassword.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"please input admin new password\");\r\n");
      out.write("         adminedit.adminoldpassword.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("         document.adminedit.submit();\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("    <div align=\"center\"><fieldset><legend>Edit admin accout</legend>\r\n");
      out.write("      <table>\r\n");
      out.write("          <form name=\"adminedit\" action=\"admineditserv\" method=\"post\">\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td id=\"label\">admin username:</td>\r\n");
      out.write("          <td><label>\r\n");
      out.write("            <input type=\"text\" name=\"adminusername\" id=\"adminusername\">\r\n");
      out.write("          </label></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td id=\"label\">admin old password:</td>\r\n");
      out.write("          <td><label>\r\n");
      out.write("            <input type=\"text\" name=\"adminoldpassword\" id=\"adminoldpassword\">\r\n");
      out.write("          </label></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td id=\"label\">admin new password:</td>\r\n");
      out.write("          <td><label>\r\n");
      out.write("            <input type=\"text\" name=\"adminnewpassword\" id=\"adminnewpassword\">\r\n");
      out.write("          </label></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td></td>\r\n");
      out.write("          <td><label>\r\n");
      out.write("                  <input type=\"hidden\" name=\"action\" value=\"adminedit\">\r\n");
      out.write("                  <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\" onclick=\"checkadmininformation()\">\r\n");
      out.write("            <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("          </label></td>\r\n");
      out.write("        </tr></form>\r\n");
      out.write("      </table></fieldset>\r\n");
      out.write("    </div>\r\n");
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
