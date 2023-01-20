package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class VaccinationCenter {
     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
	 private Integer code;
	 private String centerName;
	 private String address;
	 private String city;
	 private String state;
	 private String pincode;
	 
	 @OneToOne
	 private Appointment apointment;
	 
	 @OneToOne(mappedBy="vaccinationcenter",cascade = CascadeType.ALL)
	 private VaccineInventory vaccineinventory;

	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VaccinationCenter(Integer code, String centerName, String address, String city, String state, String pincode,
			Appointment apointment, VaccineInventory vaccineinventory) {
		super();
		this.code = code;
		this.centerName = centerName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.apointment = apointment;
		this.vaccineinventory = vaccineinventory;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Appointment getApointment() {
		return apointment;
	}

	public void setApointment(Appointment apointment) {
		this.apointment = apointment;
	}

	public VaccineInventory getVaccineinventory() {
		return vaccineinventory;
	}

	public void setVaccineinventory(VaccineInventory vaccineinventory) {
		this.vaccineinventory = vaccineinventory;
	}

	@Override
	public String toString() {
		return "VaccinationCenter [code=" + code + ", centerName=" + centerName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", pincode=" + pincode + ", apointment=" + apointment
				+ ", vaccineinventory=" + vaccineinventory + "]";
	}
	 
	 
	 
	 
	 
}
