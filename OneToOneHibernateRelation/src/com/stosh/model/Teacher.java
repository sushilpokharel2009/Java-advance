package com.stosh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher<phone, Phone> {
	
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int teacherId;

private String name;
private String address;
	
@OneToOne(mappedBy="teacher")
private PhoneNo ph1;
//??????????

public int getTeacherId() {
	return teacherId;
}

public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public PhoneNo getPh1() {
	return ph1;
}

public void setPh1(PhoneNo ph1) {
	this.ph1 = ph1;
}

}

	
	
	
