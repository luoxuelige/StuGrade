package dao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mode.StudentBean;
import util.DB;
import forms.LoginForm;
public class MysqlFun implements StudentDao {
	Connection conn = null;
	Statement sta = null;
	ResultSet rs = null;
	String sql = null;
	PreparedStatement pstmt = null;
	List list = new ArrayList();
	@Override
	public boolean con(String name, String password, int shenfen) {
		
try{
			
			if(shenfen==1) {
				sql="select * from adminlogin where username='"+name+"' and password='"+password+"'";
				}
			if(shenfen==0) {
				sql="select * from studentlogin where username='"+name+"' and password='"+password+"'";
				}
			conn = DB.getConn();
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);

			if(rs.next()){
				return true;
			}}catch(Exception e){
				e.printStackTrace();
				return false;	
			}finally{
				DB.closeRs(rs);
				DB.closeStmt(sta);
				DB.closeConn(conn);
			}
			return false;
		}
	public List findAllUser() {
		try{
			
		 	sql="select * from grades";
			 //数据库连接
		 	conn = DB.getConn();
			sta = conn.createStatement();
			rs = sta.executeQuery(sql);
			while(rs.next()){
				
				StudentBean bean = new StudentBean();
				 bean.setid(rs.getString(1));
				
				 bean.setgradeone(rs.getInt(2));
				 bean.setgradetwo(rs.getInt(3));
				 bean.setgradethree(rs.getInt(4));
				 bean.setgradefour(rs.getInt(5));
				list.add(bean);
			}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					if(rs != null) {
						rs.close();
						rs = null;
					}
					if(sta != null) {
						sta.close();
						sta= null;
					}
					if(conn != null) {
						conn.close();
						conn = null;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return list;
	}

	@Override
	public int delUserById(String id) {

		String sql=null;
		int rs = 0;
		Connection conn = null;
		Statement sta = null;
		 

		try {
			sql="delete from grades where StudentID = "+id;
			conn = DB.getConn();
			sta = conn.createStatement();
		 
			rs=sta.executeUpdate(sql);
		}  catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sta != null) {
					sta.close();
					sta= null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return rs;
	}

	@Override
	public StudentBean findUserById(String id) {
		StudentBean bean=null;
		try{
			
		sql="select * from grades where StudentID='"+id+"'";
		 
	 	conn = DB.getConn();
		sta = conn.createStatement();
		rs = sta.executeQuery(sql);
		if (rs.next()){
			
		    bean = new StudentBean();
		    bean.setid(rs.getString(1));
			
			 bean.setgradeone(rs.getInt(2));
			 bean.setgradetwo(rs.getInt(3));
			 bean.setgradethree(rs.getInt(4));
			 bean.setgradefour(rs.getInt(5));
		 
		}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(rs != null) {
					rs.close();
					rs = null;
				}
				if(sta != null) {
					sta.close();
					sta= null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bean;
		}

	@Override
	public boolean modifyUser(StudentBean regf, String id) {
 
		
		int gradeone=regf.getgradeone();
	    int gradetwo=regf.getgradetwo();
		int gradethree=regf.getgradethree();
		int gradefour=regf.getgradefour();
		
		sql="update grades set English='"+gradeone+"',Math='"+gradetwo+"',Web='"+gradethree+"',java='"+gradefour+"' where StudentID="+id;
		 
		  
		try  {
			conn = DB.getConn();
			sta = conn.createStatement();
			sta.executeUpdate(sql);
			return true; 
		}
		catch (Exception e) {
		   e.printStackTrace();  
		} finally {
	
			DB.closeStmt(sta);
			DB.closeConn(conn);
		}
		 return false;
	}
	

	
	@Override
	public boolean ifexist(String id) {
try {
	sql="select * from grades where StudentID='"+id+"'";
	
    conn = DB.getConn();
    sta = conn.createStatement();
    rs = sta.executeQuery(sql);

    if(rs.next()){
	return true;}
}catch(Exception e){
	e.printStackTrace();
	return false;	
   }finally{
	DB.closeRs(rs);
	DB.closeStmt(sta);
	DB.closeConn(conn);
}
return false;
	}
	
	public boolean insert(String id,int gradeone, int gradetwo, int gradethree, int gradefour) { 
		
		 
		  
		try  {
			conn = DB.getConn();
			PreparedStatement ps=conn.prepareStatement("insert into grades(StudentID,English,Math,Web,Java) values(?,?,?,?,?)");
			ps.setString(1, id);
			ps.setInt(2, gradeone);
			ps.setInt(3, gradetwo);
			ps.setInt(4,gradethree);
			ps.setInt(5, gradefour);
			ps.executeUpdate();
			
			return true; 
       
		}
		catch (Exception e) {
		   e.printStackTrace();  
		} finally {
	
			DB.closeStmt(sta);
			DB.closeConn(conn);
		}
		 return false;
	}
	

	

}
