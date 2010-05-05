package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminmanage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write("  <head>\r\n");
      out.write("   <title>manage admin</title>\r\n");
      out.write("\t<link href=\"css/styleHRS.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write(" <body><div align=\"center\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("  <td><a href=adminadd.jsp>Create admin accout</a><br><br>\r\n");
      out.write("  <a href=adminedit.jsp>Edit admin info</a></td>\r\n");
      out.write("  <td>    ");

       Vector<String []> vadmin = serv.database.getAdminInfo();
     
      out.write("\r\n");
      out.write("    <table border=\"1\">\r\n");
      out.write("      <tr bgcolor=\"#999999\">\r\n");
      out.write("        <th id=\"thlabel\">adminID</th>\r\n");
      out.write("        <th id=\"thlabel\">adminlevel</th>\r\n");
      out.write("        <th id=\"thlabel\">delete</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      ");

      for(String []s:vadmin)
      {
     
      out.write("\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>");
      out.print( s[0] );
      out.write("</td>\r\n");
      out.write("        ");

        if(s[1].equals("root"))
        {
        
      out.write("\r\n");
      out.write("        <td>root</td>\r\n");
      out.write("        ");

        }
        else
        {
         
      out.write("\r\n");
      out.write("        <td>advanced</td>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("        <td>\r\n");
      out.write("          <a href=admindelserv?action=deladmin&&adminusername=");
      out.print( s[0] );
      out.write(">Del</a>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("      ");

       }
      
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      </table></td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("  <td>&nbsp;</td>\r\n");
      out.write("  <td> <label>\r\n");
      out.write("    <input type=\"button\" name=\"back\" id=\"back\" value=\"back\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("    </label></td>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
