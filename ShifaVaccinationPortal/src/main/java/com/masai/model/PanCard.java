package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PanCard {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panId;
	
	//@Size(min = 10, max = 10, message = "{user.invalid.panNumber}")
	@Column(unique = true)
	private String panoNo;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "panCard")
	@JsonIgnore
	private IdCard idCard;
	
	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PanCard(int panId, String panoNo, IdCard idCard) {
		super();
		this.panId = panId;
		this.panoNo = panoNo;
		this.idCard = idCard;
	}

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanoNo() {
		return panoNo;
	}

	public void setPanoNo(String panoNo) {
		this.panoNo = panoNo;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "PanCard [panId=" + panId + ", panoNo=" + panoNo + ", idCard=" + idCard + "]";
	}

	

	
}
