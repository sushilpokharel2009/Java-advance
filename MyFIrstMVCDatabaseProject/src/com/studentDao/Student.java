package com.studentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import com.mysql.jdbc.PreparedStatement;
import com.student.modals.StudentReport;






public class Student {
	
	public void insertStudentData(StudentReport sr){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection ctn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyClassReport1", "root", "");
			
			String query = "insert into MyStudentTable(studentAddress,studentPhoneNumber,studentEmail,classTeacher,parentsName,studentClass,studentFirstName,studentLastName,age,position)values(?,?,?,?,?,?,?,?,?,?)";
			
			
			
			PreparedStatement pst =  ctn.prepareStatement(query);
			
			pst.setString(1, sr.getStudentAddress());
			pst.setInt(2, sr.getStudentPhoneNumber());
			pst.setString(3, sr.getStudentEmail());
			pst.setString(4, sr.getClassTeacher());
			pst.setString(5, sr.getParentsName());
			pst.setInt(6, sr.getStudentClass());
			pst.setString(7, sr.getStudentFirstName());
			pst.setString(8, sr.getStudentLastName());
			pst.setInt(9, sr.getAge());
			pst.setInt(10, sr.getPosition());
			
			
			pst.execute();
			ctn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
