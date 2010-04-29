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
 * @author Wang Qichen
 */
public class orderserv extends HttpServlet{
	public void init(ServletConfig conf) throws ServletException
	{
		super.init(conf);
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException, IOException{
		doPost(req,res);
	}
	public void doPost(HttpServletRequest httpservletrequest,HttpServletResponse httpservletresponse)
	throws ServletException, IOException{
		String action = httpservletrequest.getParameter("action");
		HttpSession session=httpservletrequest.getSession(true);
		PrintWriter printwriter=httpservletresponse.getWriter();
		String msg="";
		String username = (String)session.getAttribute("username");
		String accept = "waiting for accept";
		String successfully = "successfully";
		String failed = "failed";

                Vector<String[]> OrderList = (Vector<String[]>)session.getAttribute("OrderList");
                if(OrderList==null)
		{OrderList = new Vector<String[]>();}
                if(action.equals("order")){
			if(username==null){
				msg = "you are not login yet。<br><br>"+
				     "<a href=login.jsp>login now?>>";
				httpservletrequest.setAttribute("msg",msg);
				httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest,httpservletresponse);
			}
			else{
				String sql = "select * from order where orderuser='"+username+"'";
				Vector<String []> list = orderdatabase.getOrderList(sql);
				httpservletrequest.setAttribute("list",list);
				httpservletrequest.getRequestDispatcher("list.jsp").forward(httpservletrequest,httpservletresponse);
			}
                }
                if(action.equals("add")){
			String orderNum = (String)httpservletrequest.getParameter("orderNum");
			if(orderNum!=null){
				String startyear = (String)httpservletrequest.getParameter("startyear");
				String startmonth = (String)httpservletrequest.getParameter("startmonth");
				String startday = (String)httpservletrequest.getParameter("startday");
				String starthour = (String)httpservletrequest.getParameter("starthour");

				String finishyear = (String)httpservletrequest.getParameter("finishyear");
				String finishmonth = (String)httpservletrequest.getParameter("finishmonth");
				String finishday = (String)httpservletrequest.getParameter("finishday");
				String finishhour = (String)httpservletrequest.getParameter("finishhour");

				String group = (String)httpservletrequest.getParameter("group");
				String starttime = startyear+"-"+startmonth+"-"+startday+"-"+starthour+":"+"00";
				String endtime = finishyear+"-"+finishmonth+"-"+finishday+"-"+finishhour+":"+"00";
				String[] s = new String[4];
				s[0] = orderNum;
                                s[1] = group;
				s[2] = starttime;
                                s[3] = endtime;
				OrderList.add(s);
				session.setAttribute("OrderList",OrderList);
                                msg = "Reservation successful!<br><br><a href=roomgrouplist.jsp>continue?</a> or <a href=index.jsp>return</a>";
			}
                        httpservletrequest.setAttribute("msg",msg);
			httpservletresponse.sendRedirect("roomgrouplist.jsp");
		}
            if(action.equals("delete")){
			String id = httpservletrequest.getParameter("index");
			int index = Integer.parseInt(id);
			OrderList.remove(index);
			httpservletresponse.sendRedirect("userorder.jsp");
		}
            if(action.equals("empty")){
			OrderList.removeAllElements();
			session.setAttribute("OrderList",OrderList);
			httpservletresponse.sendRedirect("userorder.jsp");
		}
           if(action.equals("submit")){
			if(username!=null){
				if(orderdatabase.addOrder(username,OrderList)!=-1){
					OrderList.removeAllElements();
					msg = "Success!<br><br>"+
					       "<a href=index.jsp>return";
				}
				else{
					msg = "Sorry,crashed!<br><br>"+
					       "<a href=index.jsp>return";
				}
			}
			else{
				msg = "you are not login yet。<br><br>"+
				     "<a href=login.jsp>login>>";
			}
			httpservletrequest.setAttribute("msg",msg);
			httpservletrequest.getRequestDispatcher("usercheck.jsp").forward(httpservletrequest,httpservletresponse);
		}
    }
}