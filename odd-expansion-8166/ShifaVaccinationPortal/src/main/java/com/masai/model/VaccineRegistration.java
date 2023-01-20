package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class VaccineRegistration {
   
	 @Id
	  private Long mobileNo;
	 private LocalDate dateofregistration; 
	 
	 @OneToMany(mappedBy="vaccineregistration", cascade = CascadeType.ALL )
	 private List<Member> memberlist = new ArrayList<Member>();

	public VaccineRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VaccineRegistration(Long mobileNo, LocalDate dateofregistration, List<Member> memberlist) {
		super();
		this.mobileNo = mobileNo;
		this.dateofregistration = dateofregistration;
		this.memberlist = memberlist;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDateofregistration() {
		return dateofregistration;
	}

	public void setDateofregistration(LocalDate dateofregistration) {
		this.dateofregistration = dateofregistration;
	}

	public List<Member> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}

	@Override
	public String toString() {
		return "VaccineRegistration [mobileNo=" + mobileNo + ", dateofregistration=" + dateofregistration
				+ ", memberlist=" + memberlist + "]";
	} 
	 
	 
	 
	 
}
