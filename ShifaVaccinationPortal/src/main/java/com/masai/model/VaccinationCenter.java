package com.masai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class VaccinationCenter {
     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
	 private Integer vaccinationCentercode;
     
  
 //	@Size(min = 2, max = 20, message = "{VaccinationCenter.invalid.centername}")
 	private String centername;
 	
 	//@Size(min = 2, max = 20, message = "{VaccinationCenter.invalid.address}")
 	private String address;
 	
 	//@Size(min = 2, max = 20, message = "{VaccinationCenter.invalid.city}")
 	private String city;
 	
 	//@Size(min = 2, max = 20, message = "{VaccinationCenter.invalid.state}")
 	private String state;
 	
 	//@Size(min = 6, message = "{VaccinationCenter.invalid.pincode}")
 	private String pincode;
 	
 	@OneToMany
 	@JsonIgnore
 	private List<Appointment> appointments;
 	
 	@OneToMany(cascade = CascadeType.ALL)
 	private List<VaccineInventory> vaccineInventory;

	public VaccinationCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VaccinationCenter(Integer vaccinationCentercode, String centername, String address, String city,
			String state, String pincode, List<Appointment> appointments, List<VaccineInventory> vaccineInventory) {
		super();
		this.vaccinationCentercode = vaccinationCentercode;
		this.centername = centername;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.appointments = appointments;
		this.vaccineInventory = vaccineInventory;
	}

	public Integer getVaccinationCentercode() {
		return vaccinationCentercode;
	}

	public void setVaccinationCentercode(Integer vaccinationCentercode) {
		this.vaccinationCentercode = vaccinationCentercode;
	}

	public String getCentername() {
		return centername;
	}

	public void setCentername(String centername) {
		this.centername = centername;
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

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<VaccineInventory> getVaccineInventory() {
		return vaccineInventory;
	}

	public void setVaccineInventory(List<VaccineInventory> vaccineInventory) {
		this.vaccineInventory = vaccineInventory;
	}

	@Override
	public String toString() {
		return "VaccinationCenter [vaccinationCentercode=" + vaccinationCentercode + ", centername=" + centername
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", appointments=" + appointments + ", vaccineInventory=" + vaccineInventory + "]";
	} 
 	
 	
	 
}
