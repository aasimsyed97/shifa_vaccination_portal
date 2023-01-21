package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer bookingId;
	
	private String mobileNo; 
	
	private LocalDate datofbooking; 
	
	//private String Slot; 
	
	private boolean bookingstatus;
	
	@OneToOne( cascade = CascadeType.ALL)
	private Member member;
	 
     @OneToOne (cascade = CascadeType.ALL) 
     @JsonIgnore
	private VaccinationCenter vaccinationcenter;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Integer bookingId, String mobileNo, LocalDate datofbooking, boolean bookingstatus, Member member,
			VaccinationCenter vaccinationcenter) {
		super();
		this.bookingId = bookingId;
		this.mobileNo = mobileNo;
		this.datofbooking = datofbooking;
		this.bookingstatus = bookingstatus;
		this.member = member;
		this.vaccinationcenter = vaccinationcenter;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDatofbooking() {
		return datofbooking;
	}

	public void setDatofbooking(LocalDate datofbooking) {
		this.datofbooking = datofbooking;
	}

	public boolean isBookingstatus() {
		return bookingstatus;
	}

	public void setBookingstatus(boolean bookingstatus) {
		this.bookingstatus = bookingstatus;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public VaccinationCenter getVaccinationcenter() {
		return vaccinationcenter;
	}

	public void setVaccinationcenter(VaccinationCenter vaccinationcenter) {
		this.vaccinationcenter = vaccinationcenter;
	}

	@Override
	public String toString() {
		return "Appointment [bookingId=" + bookingId + ", mobileNo=" + mobileNo + ", datofbooking=" + datofbooking
				+ ", bookingstatus=" + bookingstatus + ", member=" + member + ", vaccinationcenter=" + vaccinationcenter
				+ "]";
	}


     
     
     
	
}
