package co.stosh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Phone {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int phoneId;
	
	
	
	private String phoneNumber;
	
	
	@ManyToOne
	@JoinColumn(name = "diverId")
	private Driver dr;


	public int getPhoneId() {
		return phoneId;
	}


	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Driver getDr() {
		return dr;
	}


	public void setDr(Driver dr) {
		this.dr = dr;
	}

}
