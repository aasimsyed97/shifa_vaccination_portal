package com.masai.dto;

import java.time.LocalDate;
import java.util.Date;

public class MemberUpdateDto {

	
	
	//@Size(min = 2, max = 20, message = "{user.invalid.Name}")
	private String Name;
	
	private LocalDate DateOfBirth ;
	
	private String gender;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.Address}")
	private String Address ;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.City}")
	private String city ;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.State}")
	private String State ;

	public MemberUpdateDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public MemberUpdateDto(String name, LocalDate dateOfBirth, String gender, String address, String city, String state) {
		super();
		Name = name;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		Address = address;
		this.city = city;
		State = state;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}



	@Override
	public String toString() {
		return "MemberUpdateDto [Name=" + Name + ", DateOfBirth=" + DateOfBirth + ", gender=" + gender + ", Address="
				+ Address + ", city=" + city + ", State=" + State + "]";
	} 
	
	
	
}
