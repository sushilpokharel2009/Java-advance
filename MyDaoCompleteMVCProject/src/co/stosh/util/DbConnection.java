package co.stosh.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection myConnection() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySecondMVC","root","");
			return con;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}

	
}
