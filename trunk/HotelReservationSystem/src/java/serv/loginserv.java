/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Wang Qi Chen
 */
public class loginserv extends HttpServlet {

    public void init(ServletConfig servletconfig) throws ServletException {
        super.init(servletconfig);
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        doPost(httpservletrequest, httpservletresponse);
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse) throws ServletException, IOException {
        String action = httpservletrequest.getParameter("action");
        HttpSession httpsession = httpservletrequest.getSession(true);
        PrintWriter printwriter = httpservletresponse.getWriter();
        String msg = "";
        if (action.equals("login")) {
            httpsession.removeAttribute("username");
            String username = httpservletrequest.getParameter("username").trim();
            String pserwd = httpservletrequest.getParameter("password").trim();
            String sqla = "select * from user where username='" + username + "'";
            if (database.isExist(sqla)) {
                String sql = "select password from user where username='" + username + "'";
                String password = database.getInfomation(sql).trim();
                if (pserwd.equals(password)) {
                    httpsession.setAttribute("username", username);
                    httpservletresponse.sendRedirect("index.jsp");
                } else {
                    msg = username + " invalid password!!!<br><br><a href=login.jsp>please login again</a>";
                    httpservletrequest.setAttribute("msg", msg);
                    httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest, httpservletresponse);
                }
            } else {
                msg = username + " invalid user!!!<br><br><a href=login.jsp>please login again</a>";
                httpservletrequest.setAttribute("msg", msg);
                httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest, httpservletresponse);
            }

        }
       if(action.equals("adminlogin")){
			httpsession.removeAttribute("adminusername");
                        String root="root";
                        String Advanced="advanced";
			String adminusername = httpservletrequest.getParameter("username").trim();
			String adminpwd =  httpservletrequest.getParameter("password").trim();
			String sqla = "select adminpassword from admin where adminusername='"+adminusername+"'";
			String dbpwd = database.getInfo(sqla);
			if(dbpwd!=null&&adminpwd.equals(dbpwd)){
                            String sqlb = "select authority from admin where adminusername='"+adminusername+"'";
                            String authority = database.getInfo(sqlb);
                            if(authority.equals(root.intern())){
				httpsession.setAttribute("adminroot",adminusername);
                            httpservletresponse.sendRedirect("index.jsp");
                            } else if(authority.equals(Advanced.intern())){
                                httpsession.setAttribute("adminusername",adminusername);
                            httpservletresponse.sendRedirect("index.jsp");
                            }
			}
			else{
				msg = "login error!<br><br>"+
				 		"<a href=adminlogin.jsp>login again?";
			httpservletrequest.setAttribute("msg",msg);
			httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest,httpservletresponse);
		}
    }
        			}

}
