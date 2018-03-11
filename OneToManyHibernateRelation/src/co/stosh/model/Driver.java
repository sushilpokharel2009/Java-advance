package co.stosh.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Driver {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;
	
	
	
	private String name;
	private String address;
	
	
	@OneToMany(mappedBy = "dr")
	private List<Phone> diverPhoneNumbers;


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
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


	public List<Phone> getDiverPhoneNumbers() {
		return diverPhoneNumbers;
	}


	public void setDiverPhoneNumbers(List<Phone> diverPhoneNumbers) {
		this.diverPhoneNumbers = diverPhoneNumbers;
	}

}
