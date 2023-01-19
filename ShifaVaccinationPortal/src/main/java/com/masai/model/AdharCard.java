package com.masai.model;

public class AdharCard {
 
	private Long adharNo;
	private String fingerprint;
	private String irisscan;
	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdharCard(Long adharNo, String fingerprint, String irisscan) {
		super();
		this.adharNo = adharNo;
		this.fingerprint = fingerprint;
		this.irisscan = irisscan;
	}
	public Long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getIrisscan() {
		return irisscan;
	}
	public void setIrisscan(String irisscan) {
		this.irisscan = irisscan;
	}
	@Override
	public String toString() {
		return "AdharCard [adharNo=" + adharNo + ", fingerprint=" + fingerprint + ", irisscan=" + irisscan + "]";
	}
	
	
	
	
	
}
