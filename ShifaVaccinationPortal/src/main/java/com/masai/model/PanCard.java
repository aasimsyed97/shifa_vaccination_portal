package com.masai.model;

public class PanCard {
 
	 private String panNo;

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PanCard(String panNo) {
		super();
		this.panNo = panNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "PanCard [panNo=" + panNo + "]";
	}
	 
	 
	
}
