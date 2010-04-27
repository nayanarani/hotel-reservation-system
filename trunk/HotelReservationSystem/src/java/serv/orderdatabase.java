/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.sql.*;
import javax.sql.*;
import java.util.*;

/**
 *
 * @author Wang Qichen
 */
public class orderdatabase {

    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultset = null;

    public static boolean isOrdered(String rgid1) {
        boolean b = false;
        try {
            String accept = new String("waiting for accept");
            String used = new String("used");
            String rgid = new String(rgid1);
            connection = database.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery("select rgid from oinfo where ostatus='"
                    + accept + "' and rgid='" + rgid + "'");
            if (resultset.next()) {
                b = true;
            }
            resultset = statement.executeQuery("select rgid from resource where rstatus='"
                    + used + "' and rgid='" + rgid + "'");
            if (resultset.next()) {
                b = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return b;
    }

    public static Vector<String[]> getOrderList(String sqla) {
        Vector<String[]> v = new Vector<String[]>();
        try {
            connection = database.getConnection();
            statement = connection.createStatement();
            String sql = new String(sqla);
            resultset = statement.executeQuery(sql);
            while (resultset.next()) {
                String s[] = new String[6];
                for (int i = 0; i < s.length; i++) {
                    s[i] = new String(resultset.getString(i + 1));
                }
                v.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            database.closeConnection();
        }
        return v;
    }

    	public static Vector<String []> getOrderedDay(String rgid1){
		Vector<String []> v = new Vector<String []>();
		try{
			String ostatus = new String("Success!");
			String rgid = new String(rgid1);
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select ftime,etime from oinfo where ostatus='"+
								ostatus+"' and rgid='"+rgid+"'");
			while(resultset.next()){
				String []s =new String[2];
				s[0] = new String(resultset.getString(1));
				s[1] = new String(resultset.getString(2));
				java.util.Date etime = orderdatabase.chageStringToDate(s[1]);
				java.util.Date now = new java.util.Date();
				if(etime.after(now)) {v.add(s);}
			}
		}
		catch(Exception e)	{e.printStackTrace();}
		finally {database.closeConnection();}
		return v;
	}

        	public static java.util.Date chageStringToDate(String s){
		java.util.Date da = null;
		if(s!=null){
			String p = "-|:| ";
			String[] d = s.split(p);
			int[] date = new int[d.length];
			for(int i=0;i<d.length;i++)
			{date[i]=Integer.parseInt(d[i]);}
			da = new java.util.Date(date[0]-1900,date[1]-1,date[2],date[3],date[4]);
		}
		return da;
	}

       	public static int addOrder(String orderuser,Vector<String[]> OrderList)
	{
		int i = 0;
		int orderdetailid = database.getId("orderdetail","orderdetailid");
		int orderid = database.getId("order","orderid");
		try{
			connection = database.getConnection();
			statement = connection.createStatement();
			java.util.Date d = new java.util.Date();
			String ordertime = d.toLocaleString();
			connection.setAutoCommit(false);
			String sqla = "insert into order(orderid,orderuser,ordertime) values"+
					"(NULL,'"+orderuser+"','"+ordertime+"')";
			String sql = new String(sqla);
			statement.executeUpdate(sql);
			Vector<String> sqlb = new Vector<String>();
			for(String []s:OrderList){
				String roomname = s[0];
				String starttime = s[2];
                                String endtime = s[3];
				String sqlc = "insert into orderdetail(orderdetailid,orderid,roomname,starttime,endtime) values"+
						"(NULL,"+orderid+",'"+roomname+"','"+starttime+"','"+endtime+"')";
				String sqld = new String(sqlc);
				statement.executeUpdate(sqld);
			}
			connection.commit();
			connection.setAutoCommit(true);
		}
		catch(Exception e){
			e.printStackTrace();
			i = -1;
			try{connection.rollback();}
			catch(Exception ea)	{e.printStackTrace();}
		}
		finally	{database.closeConnection();}
		return i;
	}
}
