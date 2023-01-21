package com.masai.service;

import com.masai.dto.AdminDto;
import com.masai.dto.CurrentUserSession;
import com.masai.exception.AdminException;
import com.masai.exception.LoginException;
import com.masai.model.Admin;

public interface AdminService {
  
	public Admin registerAdmin(Admin admin) throws AdminException;

	public Admin updateAdmin(Admin admin,String key) throws AdminException, LoginException;

	public String deleteAdminAccount(String key) throws AdminException, LoginException;

	public Admin findBykey(String key) throws AdminException, LoginException;
	
	public CurrentUserSession loginAdmin(AdminDto admin) throws LoginException;
	
	public String logoutAdmin(String key) throws LoginException;
}
