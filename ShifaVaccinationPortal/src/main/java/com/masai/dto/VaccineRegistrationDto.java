package com.masai.dto;

public class VaccineRegistrationDto {

	private int registrationId;
	private String mobileno;
	public VaccineRegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VaccineRegistrationDto(int registrationId, String mobileno) {
		super();
		this.registrationId = registrationId;
		this.mobileno = mobileno;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "VaccineRegistrationDto [registrationId=" + registrationId + ", mobileno=" + mobileno + "]";
	}
	
	

}
