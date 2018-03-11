package com.stosh.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//??????
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int doctorId;
	private String Name;
	private String email;
	private String phoneNo;
	
	
	//@ManyToMany(mappedBy="dList")
	@ManyToMany
	@JoinTable(name="DoctorAddress",joinColumns=@JoinColumn(name="doctorId"), inverseJoinColumns=@JoinColumn(name="addressId"))
	private List<DAddress>dAddressList = new ArrayList<>();


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public List<DAddress> getdAddressList() {
		return dAddressList;
	}


	public void setdAddressList(List<DAddress> dAddressList) {
		this.dAddressList = dAddressList;
	}

}
