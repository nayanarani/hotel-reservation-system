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

    public static boolean isOrdered(String rname) {
        boolean b = false;
        try {
            String apply = new String("waiting for apply");
            String used = new String("successd");
            String roomname = new String(rname);
            connection = database.getConnection();
            statement = connection.createStatement();
            resultset = statement.executeQuery("select roomname from orderdetail where status='"
                    + apply + "' and roomname='" + roomname + "'");
            if (resultset.next()) {
                b = true;
            }
            resultset = statement.executeQuery("select roomname from room where status='"
                    + used + "' and roomname='" + roomname + "'");
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

    	public static Vector<String []> getOrderedDay(String getroomname){
		Vector<String []> v = new Vector<String []>();
		try{
			String status = new String("Success!");
			String roomname = new String(getroomname);
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select starttime,endtime from orderdetail where status='"+
								status+"' and roomname='"+roomname+"'");
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
//		int orderdetailid = database.getId("orderdetail","orderdetailid");
		int orderid = database.getId("orders","orderid");
		try{
			connection = database.getConnection();
			statement = connection.createStatement();
			java.util.Date d = new java.util.Date();
			String ordertime = d.toLocaleString();
			connection.setAutoCommit(false);
                        String sqla = "INSERT INTO orders (orderid,orderuser,ordertime) VALUES (NULL,'"+orderuser+"','"+ordertime+"')";
			statement.executeUpdate(sqla);
			Vector<String> sqlb = new Vector<String>();
			for(String []s:OrderList){
				String roomname = s[0];
				String starttime = s[2];
                                String endtime = s[3];
				String sqlc = "insert into orderdetail (detailid,orderid,roomname,starttime,endtime) values (NULL,"+orderid+",'"+roomname+"','"+starttime+"','"+endtime+"')";
				statement.executeUpdate(sqlc);
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
        public static Vector<String []> getOrderDetail(String orderid){
		Vector<String []> v = new Vector<String[]>();
		try{
			connection = database.getConnection();
			statement = connection.createStatement();
			resultset = statement.executeQuery("select roomname,starttime,endtime,status from orderdetail where orderid='"+orderid+"'");
			while(resultset.next()){
				String s[] = new String[5];
				for(int i=0;i<s.length-1;i++){
					s[i] = new String(resultset.getString(i+1));
				}
				v.add(s);
			}
			for(String[] s:v){
				String roomname = new String(s[0]);
				resultset = statement.executeQuery("select groupname from roomgroup where groupid=("+
							"select roomgroup from room where roomname='"+roomname+"')");
				resultset.next();
				s[4] = new String(resultset.getString(1));
			}
		}
		catch(Exception e) {e.printStackTrace();}
		finally	{database.closeConnection();}
		return v;
	}
}
