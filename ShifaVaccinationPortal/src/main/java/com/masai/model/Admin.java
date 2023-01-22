package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Admin { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer adminId;
	
	//@Size(min = 2, max = 20, message = "{user.invalid.Name}")
	private String adminName;
	
	//@Pattern(regexp = "^[0-9]{10}", message = "{user.invalid.contact}")
	@Column(unique = true)
	private String adminMobileNumber;
	
//	@Email
	@Column(unique = true)
	private String adminUsername;
	
	//@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message = "{user.invalid.password}")
	private String adminPassword;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, String adminName, String adminMobileNumber, String adminUsername, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminMobileNumber = adminMobileNumber;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminMobileNumber() {
		return adminMobileNumber;
	}

	public void setAdminMobileNumber(String adminMobileNumber) {
		this.adminMobileNumber = adminMobileNumber;
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

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminMobileNumber=" + adminMobileNumber
				+ ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword + "]";
	} 
	
	

}
