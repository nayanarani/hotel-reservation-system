/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Wang Qi Chen
 */
public class listserv extends HttpServlet {

    public void init(ServletConfig conf) throws ServletException {
        super.init(conf);
    }

    public void doGet(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
            throws ServletException, IOException {
        doPost(httpservletrequest, httpservletresponse);
    }

    public void doPost(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
            throws ServletException, IOException {
        String action = httpservletrequest.getParameter("action");
        HttpSession session = httpservletrequest.getSession(true);
        String msg = "";
        if (action.equals("list")) {
            int groupid = Integer.parseInt(httpservletrequest.getParameter("groupid"));
            Vector<String> list = database.getGroupInfomation(groupid);
            session.setAttribute("list", list);
            httpservletresponse.sendRedirect("roomgrouplist.jsp");
        }
        if(action.equals("status")){
			Vector<String []> v = null;
			String isOrdered = "NO";
			String roomname = httpservletrequest.getParameter("roomname");
			if(orderdatabase.isOrdered(roomname)) {isOrdered = "YES";}
			else {v = orderdatabase.getOrderedDay(roomname);}
			httpservletrequest.setAttribute("v",v);
			httpservletrequest.setAttribute("roomname",roomname);
			httpservletrequest.setAttribute("isOrdered",isOrdered);
			httpservletrequest.getRequestDispatcher("statussearch.jsp").forward(httpservletrequest,httpservletresponse);
		}
    }
}
