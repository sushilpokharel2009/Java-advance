package co.stosh.studentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.stosh.modal.LogIn;
import co.stosh.modal.Student;
import co.stosh.util.DbConnection;
import co.stosh.util.LoginDBConnection;

public class LogInDao {
	
	public LogIn insertLogInInfo(LogIn lt){
		
		try {
			
			Connection con = DbConnection.myConnection();
			String query = "insert into insertStudentInfo(FirstName, LastName, Password,Address) values(?,?,?,?)";
			
			
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, lt.getFirstName());
			pst.setString(2, lt.getLastName());
			pst.setString(3, lt.getPassword());
			pst.setString(4, lt.getAddress());
			
			pst.execute();
			
			

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	
}
	
public LogIn verifyUser(LogIn lgin) {
	try {
		Connection con = LoginDBConnection.myLoginConnection();
		String qry = "select * from insertStudentInfo where Id = ?,firstName = ?, lastName = ?, password = ? and address = ?";
		PreparedStatement pst = con.prepareStatement(qry);
		pst.setInt(1, lgin.getId());
		pst.setString(2, lgin.getFirstName());
		pst.setString(3, lgin.getLastName());
		pst.setString(4, lgin.getPassword());
		pst.setString(5, lgin.getAddress());
		
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			LogIn lg5 = new LogIn();
			lg5.setId(rs.getInt("id"));
			lg5.setFirstName(rs.getString("firstName"));
			lg5.setLastName(rs.getString("lastName"));
			lg5.setPassword(rs.getString("password"));
			return lg5;
		}
		
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}


	
	
}
