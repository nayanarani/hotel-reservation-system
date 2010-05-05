package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminaddroomgroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>Add group</title>\r\n");
      out.write("   <link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("   <script language=\"JavaScript\" type=\"text/javascript\">\r\n");
      out.write("    function check()\r\n");
      out.write("    {\r\n");
      out.write("      if(document.addGroup.groupname.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"group name is null!\");\r\n");
      out.write("         addGroup.groupname.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      if(document.addGroup.groupimage.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"URL is NULL\");\r\n");
      out.write("         addGroup.groupimage.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      if(document.addGroup.groupdetails.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"details is NULL\");\r\n");
      out.write("         addGroup.groupdetails.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      if(document.addGroup.grouprules.value==\"\")\r\n");
      out.write("      {\r\n");
      out.write("         alert(\"rules is NULL!\");\r\n");
      out.write("         addGroup.grouprules.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      document.addGroup.submit();\r\n");
      out.write("    }\r\n");
      out.write("   </script>\r\n");
      out.write("  </head>\r\n");
      out.write(" <body>\r\n");
      out.write(" <div align=\"center\">\r\n");
      out.write(" <fieldset>\r\n");
      out.write("    ");

      Vector<String> groupinfo =
      	 (Vector<String>)request.getAttribute("groupinfo");
 	
      out.write("\r\n");
      out.write("   <legend>\r\n");
      out.write("    please input correct information\r\n");
      out.write("   </legend>\r\n");
      out.write("   <table border=\"0\">\r\n");
      out.write("    <form name=\"addGroup\" action=\"listserv\" method=\"post\">\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">group name:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"groupname\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">image url:</td>\r\n");
      out.write("      <td><input type=\"text\" name=\"groupimage\"></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">detail:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <textarea rows=6 cols=50 name=\"groupdetails\"></textarea>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("      <td id=\"label\">rule:</td>\r\n");
      out.write("      <td>\r\n");
      out.write("        <textarea rows=6 cols=50 name=\"grouprules\"></textarea>\r\n");
      out.write("      </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     <tr><td></td>\r\n");
      out.write("      <td>\r\n");
      out.write("       <input type=\"hidden\" name=\"action\" value=\"addGroup\">\r\n");
      out.write("       <input type=\"submit\" value=\"add\" onclick=\"check()\">\r\n");
      out.write("       <input type=\"reset\" value=\"reset\">\r\n");
      out.write("       <label>\r\n");
      out.write("         <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("       </label></td>\r\n");
      out.write("     </tr>\r\n");
      out.write("    </form>\r\n");
      out.write("   </table></fieldset></div>\r\n");
      out.write(" </body>\r\n");
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
