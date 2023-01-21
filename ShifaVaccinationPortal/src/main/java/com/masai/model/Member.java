package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore; 


@Entity
public class Member {
     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
     private Integer memberId;
     
	 private boolean dose1status=false;
	 
	 private boolean dose2status = false; 
	 
	 private LocalDate dose1date = null; 
	 
	 private LocalDate dose2date = null; 
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JsonIgnore
	 private Appointment appointment; 
	 
	 @OneToOne (cascade = CascadeType.ALL) 
	 @JsonIgnore
	 private Vaccine vaccine; 
	 
	 
	 @OneToOne (cascade = CascadeType.ALL)
	 private IdCard idcard;
	 
//	 @ManyToOne
//	 private VaccineRegistration vaccineregistration; 
//	 
	
	 
	

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

public Member(Integer memberId, boolean dose1status, boolean dose2status, LocalDate dose1date, LocalDate dose2date,
		Appointment appointment, Vaccine vaccine, IdCard idcard) {
	super();
	this.memberId = memberId;
	this.dose1status = dose1status;
	this.dose2status = dose2status;
	this.dose1date = dose1date;
	this.dose2date = dose2date;
	this.appointment = appointment;
	this.vaccine = vaccine;
	this.idcard = idcard;
}

public Integer getMemberId() {
	return memberId;
}

public void setMemberId(Integer memberId) {
	this.memberId = memberId;
}

public boolean isDose1status() {
	return dose1status;
}

public void setDose1status(boolean dose1status) {
	this.dose1status = dose1status;
}

public boolean isDose2status() {
	return dose2status;
}

public void setDose2status(boolean dose2status) {
	this.dose2status = dose2status;
}

public LocalDate getDose1date() {
	return dose1date;
}

public void setDose1date(LocalDate dose1date) {
	this.dose1date = dose1date;
}

public LocalDate getDose2date() {
	return dose2date;
}

public void setDose2date(LocalDate dose2date) {
	this.dose2date = dose2date;
}

public Appointment getAppointment() {
	return appointment;
}

public void setAppointment(Appointment appointment) {
	this.appointment = appointment;
}

public Vaccine getVaccine() {
	return vaccine;
}

public void setVaccine(Vaccine vaccine) {
	this.vaccine = vaccine;
}

public IdCard getIdcard() {
	return idcard;
}

public void setIdcard(IdCard idcard) {
	this.idcard = idcard;
}

@Override
public String toString() {
	return "Member [memberId=" + memberId + ", dose1status=" + dose1status + ", dose2status=" + dose2status
			+ ", dose1date=" + dose1date + ", dose2date=" + dose2date + ", appointment=" + appointment + ", vaccine="
			+ vaccine + ", idcard=" + idcard + "]";
}

	 
	 
	 
	 
	 
	 
	 
}
