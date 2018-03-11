package co.stosh.studentDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.stosh.modal.Student;
import co.stosh.util.DbConnection;

public class StudentDao {
	
//	to insert data
	
	public void insertStudentInfo(Student st){
		
			try {
				
				Connection con = DbConnection.myConnection();
				String query = "insert into MyStudentReport(firstName, lastName, address) values(?,?,?)";
				
				
				
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, st.getFirstName());
				pst.setString(2, st.getLastName());
				pst.setString(3, st.getAddress());
				
				pst.execute();
				con.close();
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

//	to retrive all data in list
	
	
	public List <Student> getStudentreportList(){
		
		try {
			
			Connection cons = DbConnection.myConnection();
			String query = "select * from MyStudentReport";
			PreparedStatement pst = cons.prepareStatement(query);
			
			ResultSet rls = pst.executeQuery();
			List<Student> li = new ArrayList<>();
			
			
			
			while(rls.next()) {
				Student std = new Student();
				std.setId(rls.getInt("id"));
				std.setFirstName(rls.getString("firstName"));
				std.setLastName(rls.getString("lastName"));
				std.setAddress(rls.getString("address"));
				
				
				li.add(std);
				
			}
			return li;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
//	to retrive only one property eg. id from database
	
	public Student getStudent(int id) {
		try {
			Connection con = DbConnection.myConnection();
			String query = "select from MyStudentReport where id = ?";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			
			
			ResultSet rst2 = pst.executeQuery();
			while(rst2.next()) {
				Student std2 = new Student();
				std2.setId(rst2.getInt("id"));
				std2.setFirstName(rst2.getString("firstName"));
				std2.setLastName(rst2.getString("lastName"));
				std2.setAddress(rst2.getString("address"));
				return std2;
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
//	to delete data
	
	
	public void deleteStudent(int idForDeletes) {
		try {
			Connection con = DbConnection.myConnection();
			String query3 = "delete from MyStudentReport where id = ?";
			PreparedStatement pst3 = con.prepareStatement(query3);
			pst3.setInt(1, idForDeletes);
			pst3.executeUpdate();
			con.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public void add(int i) {
		
	}
	
//	to update data
	
	public void updateStudent(Student st4) {
		try {
			Connection con = DbConnection.myConnection();
			String query4 = "update MyStudentReport set firstName = ?, lastName = ? address = ? where id = ?";
			
			
			PreparedStatement pst4 = con.prepareStatement(query4);
			
			//Student st4 = new Student();
			pst4.setString(1, st4.getFirstName());
			pst4.setString(2, st4.getLastName());
			pst4.setString(3, st4.getAddress());
			pst4.setInt(4, st4.getId());
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
