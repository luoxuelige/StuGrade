package xzt;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class sqlfun {
	int i;
	static Object[][] data;
	static Object[]   datas;
	static int column;
	static int c;
	static int j,l;
public static boolean register(Object[]a)   {
	
	 try {Connection con=jdconnection.getconnection();
PreparedStatement ps=con.prepareStatement("insert into register(admin,password,actor) values(?,?,0)");

String x=(String)a[0];
String y=(String)a[1];

ps.setString(1, x);
ps.setString(2, y);
ps.executeUpdate();

	 }catch (SQLException e) {
         e.printStackTrace();}
	
return true;
}


public static int check(Object[]a) {
	ResultSet rs;
int b;
	 try {Connection con=jdconnection.getconnection();
PreparedStatement ps=con.prepareStatement("select*from register where admin=? and password=?");
String x=(String)a[0];
String y=(String)a[1];
ps.setString(1, x);
ps.setString(2, y);
rs=ps.executeQuery();
	if(rs.next())
	{b=rs.getInt("actor");return b;}
	else {return -1;}
	}catch (SQLException e) {
        e.printStackTrace();}
	
	return -1;
}


public static boolean search(String a) {
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("select*from stu where IdNumber=?");
	
	ps1.setString(1, a);
	ResultSet rs=ps1.executeQuery();
	if(rs.next()==true) {return true;}else {return false;} }catch (SQLException e) {
        e.printStackTrace();}
		return true;
}
 

public static boolean update(String a,String b)   {
	
	 try {Connection con=jdconnection.getconnection();
PreparedStatement ps=con.prepareStatement("update register set password=? where admin=?");



ps.setString(1, b);
ps.setString(2, a);
ps.executeUpdate();

	 }catch (SQLException e) {
        e.printStackTrace();}
	
return true;
}

public static boolean update1(Object[]a)   {
	
	 try {Connection con=jdconnection.getconnection();
PreparedStatement ps=con.prepareStatement("update stu set Name=?,Java=?,Msql=?,Sum=? where IdNumber=?");
String x=(String)a[0];
String y=(String)a[1];
int z=Integer.parseInt((String) a[2]);
int m=Integer.parseInt((String) a[3]); 
int n=Integer.parseInt((String) a[4]); 
ps.setString(1, y);
ps.setInt(2, z);
ps.setInt(3, m);
ps.setInt(4, n);
ps.setString(5, x);
j=ps.executeUpdate();

	 }catch (SQLException e) {
	
        e.printStackTrace();}
	
if(j==1) {return true;}else {return false;}
}

public static void add(Object[]a) {
	 try {Connection con=jdconnection.getconnection();
PreparedStatement ps=con.prepareStatement("insert into stu(IdNumber,Name,Java,Msql,Sum) values(?,?,?,?,?)");

String x=(String)a[0];
String y=(String)a[1];
int z=Integer.parseInt(String.valueOf(a[2])); 
int m=Integer.parseInt(String.valueOf(a[3])); 
int n=Integer.parseInt(String.valueOf(a[4])); 
ps.setString(1, x);
ps.setString(2, y);
ps.setInt(3, z);
ps.setInt(4, m);
ps.setInt(5, n);
ps.executeUpdate();

	 }catch (SQLException e) {
        e.printStackTrace();}
	
	
	
}
public static Object[][] stutable(){
	
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("select*from stu");
	ResultSet rs=ps1.executeQuery();
	int rows=0,index=0;
	
	while(rs.next())
	{
		rows++;
	}
	rs.beforeFirst();
 data=new Object[rows][5];
	while(rs.next())
	{
		data[index][0]=rs.getString(1);
		data[index][1]=rs.getString(2);
		data[index][2]=rs.getString(3);
		data[index][3]=rs.getString(4);
		data[index][4]=rs.getString(5);

		index++;
	}

} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return data;	
	
}

public static int column(){
	
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("select*from stu");
	ResultSet rs=ps1.executeQuery();
	int rows=0;
	
	while(rs.next())
	{
		rows++;
	}
	rs.beforeFirst();
	column=rows;
	} catch (SQLException e) {
		
		e.printStackTrace();
	}return column;
}


public static Object[]search1(String a){
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("select*from stu where IdNumber=?");
	ps1.setString(1,a);
	ResultSet rs=ps1.executeQuery();

	while(rs.next())
	{datas=new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)};
		
	}

	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return datas;
}


public static boolean delete(String a) {
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("delete from stu where IdNumber=?");
	ps1.setString(1,a);
	c=ps1.executeUpdate();


	

	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	if(c==1) {return true;}else {return false;}
	
}
public static boolean deleteall() {
	try {Connection con=jdconnection.getconnection();
	PreparedStatement ps1=con.prepareStatement("select*from stu");
	
	ResultSet rs=ps1.executeQuery();
	
	while(rs.next())
	{
		rs.deleteRow();
		
	}
	
	

	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	if(l>=1) {return true;}else {return false;}
	
}
}