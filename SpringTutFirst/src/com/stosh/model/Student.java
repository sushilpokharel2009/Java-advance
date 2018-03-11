package com.stosh.model;

public class Student {

		private int studentId;
		private String studentName;
		private String studentAddress;
		
		private Teacher th;




		public int getStudentId() {
			return studentId;
		}




		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}




		public String getStudentName() {
			return studentName;
		}




		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}




		public String getStudentAddress() {
			return studentAddress;
		}




		public void setStudentAddress(String studentAddress) {
			this.studentAddress = studentAddress;
		}




		public Teacher getTh() {
			return th;
		}




		public void setTh(Teacher th) {
			this.th = th;
		}
}
