package com.stosh.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getDBConnection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/DaoServlet3", "root", "");
			
			return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return null;
		
	}

}
