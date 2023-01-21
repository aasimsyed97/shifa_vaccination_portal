package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer panId;
	 private String panNo;

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public PanCard(Integer panId, String panNo) {
		super();
		this.panId = panId;
		this.panNo = panNo;
	}


	public Integer getPanId() {
		return panId;
	}


	public void setPanId(Integer panId) {
		this.panId = panId;
	}


	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	@Override
	public String toString() {
		return "PanCard [panId=" + panId + ", panNo=" + panNo + "]";
	}

	 
	
}
