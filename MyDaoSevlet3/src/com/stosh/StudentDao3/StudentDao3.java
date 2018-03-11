package com.stosh.StudentDao3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.stosh.DbConnection.DBConnection;
import com.stosh.modals.MyStudents;

public class StudentDao3 {
	
	
// **************Insert Data*******************
	
	public void insertStudent3(MyStudents mst) {
		try {
			
			Connection con = DBConnection.getDBConnection();
			String query = "insert into StudentDetails3 (name, address, age) values (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			

			pst.setString(1, mst.getName());
			pst.setString(2, mst.getAddress());
			pst.setInt(3, mst.getAge());
			
			
			pst.execute();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
//     ******************Retrive data***********************
	
	public List <MyStudents> getStudentList3(){
		try {
			Connection con = DBConnection.getDBConnection();
			String query3 = "select * from StudentDetails3";
			PreparedStatement pst3 = con.prepareStatement(query3);
			
			
			
			ResultSet rs3 = pst3.executeQuery();
			
			List <MyStudents> li3 = new ArrayList<>();
			
			
			while(rs3.next()) {
				MyStudents ms3 = new MyStudents();
				
				ms3.setId(rs3.getInt("id"));
				ms3.setName(rs3.getString("name"));
				ms3.setAddress(rs3.getString("Address"));
				ms3.setAge(rs3.getInt("Age"));
				
				
				
				
				li3.add(ms3);
			}
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
