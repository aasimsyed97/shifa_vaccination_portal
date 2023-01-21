package com.masai.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.enums.Gender;
 
@Entity
public class IdCard { 
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Size(min = 2, max = 20, message = "{user.invalid.Name}")
	private String Name;
	
	private LocalDate DateOfBirth ;

	@NotNull(message="Gender can't be null")
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Size(min = 2, max = 20, message = "{user.invalid.Address}")
	private String Address ;
	
	@Size(min = 2, max = 20, message = "{user.invalid.City}")
	private String city ;
	
	@Size(min = 2, max = 20, message = "{user.invalid.State}")
	private String State ;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PanCard panCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AdharCard adharCard;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Member member;


	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IdCard(int id, @Size(min = 2, max = 20, message = "{user.invalid.Name}") String name, LocalDate dateOfBirth,
			@NotNull(message = "Gender can't be null") Gender gender,
			@Size(min = 2, max = 20, message = "{user.invalid.Address}") String address,
			@Size(min = 2, max = 20, message = "{user.invalid.City}") String city,
			@Size(min = 2, max = 20, message = "{user.invalid.State}") String state, PanCard panCard,
			AdharCard adharCard, Member member) {
		super();
		Id = id;
		Name = name;
		DateOfBirth = dateOfBirth;
		this.gender = gender;
		Address = address;
		this.city = city;
		State = state;
		this.panCard = panCard;
		this.adharCard = adharCard;
		this.member = member;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
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


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
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


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	@Override
	public String toString() {
		return "IdCard [Id=" + Id + ", Name=" + Name + ", DateOfBirth=" + DateOfBirth + ", gender=" + gender
				+ ", Address=" + Address + ", city=" + city + ", State=" + State + ", panCard=" + panCard
				+ ", adharCard=" + adharCard + ", member=" + member + "]";
	}

	
	
	
	
}
