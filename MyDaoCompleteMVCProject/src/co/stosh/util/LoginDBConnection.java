package co.stosh.util;

import java.sql.Connection;
import java.sql.DriverManager;

	public class LoginDBConnection {
		
		public static Connection myLoginConnection() {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/insertInfo","root","");
				return con;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
			
			
		}

}
