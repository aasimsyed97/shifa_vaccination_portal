package com.masai.dto;

public class UserDto {
 
	
	private String panNo;
	private String userPassword;
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDto(String panNo, String userPassword) {
		super();
		this.panNo = panNo;
		this.userPassword = userPassword;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "UserDto [panNo=" + panNo + ", userPassword=" + userPassword + "]";
	} 
	
	 
}
