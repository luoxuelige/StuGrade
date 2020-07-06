package xzt;

import java.sql.*;

public class jdconnection {
	 private static String dbdriver = "com.mysql.jdbc.Driver";
     private static String dburl = "jdbc:mysql://127.0.0.1:3306/rexe";
     
     private static String username = "root";
   
     private static String userpassword = "qiuniwuqi7";
    
     public static Connection conn = null;
	public static Connection getconnection() {
		
		 try {String name="rexe";
         Class.forName(dbdriver);            
         String myjdbcUrl = dburl.replace("cmxDatabaseName",name);
         conn = DriverManager.getConnection(myjdbcUrl, username, userpassword);
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     } catch (SQLException e) {
         e.printStackTrace();
     }
return conn;
		
	}
}
