package com.stosh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PhoneNo {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	
	private String Phone;
	
	
	@OneToOne
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
//	????????this is from class name but it is called object. teacher is object and we mane object here.


	public int getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}