package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class VaccineRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer registrationId;
	
	//@Pattern(regexp = "^[0-9]{10}", message = "{user.invalid.contact}")
	@Column(unique = true)
	private String mobileno;
	
	private LocalDate  dateofregistration = LocalDate.now();
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Member> member = new ArrayList<Member>();

	
	//@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message = "{user.invalid.password}")
	private String Password;


	public VaccineRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VaccineRegistration(Integer registrationId, String mobileno, LocalDate dateofregistration, List<Member> member,
			String password) {
		super();
		this.registrationId = registrationId;
		this.mobileno = mobileno;
		this.dateofregistration = dateofregistration;
		this.member = member;
		Password = password;
	}


	public Integer getRegistrationId() {
		return registrationId;
	}


	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}


	public String getMobileno() {
		return mobileno;
	}


	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}


	public LocalDate getDateofregistration() {
		return dateofregistration;
	}


	public void setDateofregistration(LocalDate dateofregistration) {
		this.dateofregistration = dateofregistration;
	}


	public List<Member> getMember() {
		return member;
	}


	public void setMember(List<Member> member) {
		this.member = member;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	@Override
	public String toString() {
		return "VaccineRegistration [registrationId=" + registrationId + ", mobileno=" + mobileno
				+ ", dateofregistration=" + dateofregistration + ", member=" + member + ", Password=" + Password + "]";
	}
	
	
	 
}
