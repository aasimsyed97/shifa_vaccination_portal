package com.masai.dto;

import java.time.LocalDate;

import com.masai.model.AdharCard;
import com.masai.model.PanCard;

public class IdCardDto {
  
	//@Size(min = 2, max = 20, message = "{user.invalid.Name}")
	private String Name;
	
	private LocalDate DateOfBirth ;
	
	private String Gender;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.Address}")
	private String Address ;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.City}")
	private String city ;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.State}")
	private String State;
	
	private PanCard panCard;
	
	private AdharCard adharCard;

	public IdCardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IdCardDto(String name, LocalDate dateOfBirth, String gender, String address, String city, String state,
			PanCard panCard, AdharCard adharCard) {
		super();
		Name = name;
		DateOfBirth = dateOfBirth;
		Gender = gender;
		Address = address;
		this.city = city;
		State = state;
		this.panCard = panCard;
		this.adharCard = adharCard;
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

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
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

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	@Override
	public String toString() {
		return "IdCardDto [Name=" + Name + ", Gender=" + Gender + ", Address=" + Address + ", city=" + city + ", State="
				+ State + ", panCard=" + panCard + ", adharCard=" + adharCard + "]";
	}
	
	
	
}
