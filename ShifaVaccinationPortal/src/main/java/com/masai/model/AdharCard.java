package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdharCard {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adharNo;
	private String fingerprint;
	private String irisscan;
	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdharCard(Integer adharNo, String fingerprint, String irisscan) {
		super();
		this.adharNo = adharNo;
		this.fingerprint = fingerprint;
		this.irisscan = irisscan;
	}
	public Integer getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(Integer adharNo) {
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
