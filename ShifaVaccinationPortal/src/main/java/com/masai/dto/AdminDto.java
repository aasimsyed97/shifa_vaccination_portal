package com.masai.dto;




public class AdminDto {

	private String adminUsername;
	private String adminPassword;
	
	
	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdminDto(String adminUsername, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}


	public String getAdminUsername() {
		return adminUsername;
	}


	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	
	
}
