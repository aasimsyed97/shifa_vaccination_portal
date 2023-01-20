package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long bookingId;
	private Long mobileNo;
	private LocalDate datofbooking;
	private String Slot;
	private boolean bookingstatus;
	
	@OneToOne(mappedBy = "appointment" , cascade = CascadeType.ALL)
	private Member member;
	 
     @OneToOne (mappedBy = "apointment")
	private VaccinationCenter vaccinationcenter;

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(Long bookingId, Long mobileNo, LocalDate datofbooking, String slot, boolean bookingstatus,
			Member member, VaccinationCenter vaccinationcenter) {
		super();
		this.bookingId = bookingId;
		this.mobileNo = mobileNo;
		this.datofbooking = datofbooking;
		Slot = slot;
		this.bookingstatus = bookingstatus;
		this.member = member;
		this.vaccinationcenter = vaccinationcenter;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDatofbooking() {
		return datofbooking;
	}

	public void setDatofbooking(LocalDate datofbooking) {
		this.datofbooking = datofbooking;
	}

	public String getSlot() {
		return Slot;
	}

	public void setSlot(String slot) {
		Slot = slot;
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
				+ ", Slot=" + Slot + ", bookingstatus=" + bookingstatus + ", member=" + member + ", vaccinationcenter="
				+ vaccinationcenter + "]";
	} 
     
     
     
	
}
