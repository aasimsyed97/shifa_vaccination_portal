package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.AdminDto;
import com.masai.dto.CurrentUserSession;
import com.masai.exception.AdminException;
import com.masai.exception.LoginException;
import com.masai.model.Admin;
import com.masai.service.AdminService;
import com.masai.service.VaccineService;

@RestController
@RequestMapping("/adminController")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@Autowired
	private VaccineService vaccineService;
	
	@GetMapping("/admins/{key}")
	public ResponseEntity<Admin> getUserDetailsHandler(@PathVariable("key") String key) throws AdminException, LoginException {

		Admin existingUser = adminService.findBykey(key);

		return new ResponseEntity<Admin>(existingUser, HttpStatus.OK);

	}
	
	@PostMapping("/adminsignup")
	public ResponseEntity<Admin> registerAdminHandler(@Valid @RequestBody Admin user) throws AdminException {

		Admin savedUser = adminService.registerAdmin(user);

		return new ResponseEntity<Admin>(savedUser, HttpStatus.OK);

	}
    
	@PutMapping("/admins")
	public ResponseEntity<Admin> updateAdminHandler(@Valid @RequestBody Admin user, @RequestParam("key") String key)
			throws AdminException, LoginException {

		Admin updatedUser = adminService.updateAdmin(user, key);

		return new ResponseEntity<Admin>(updatedUser, HttpStatus.OK);

	}
    
	@DeleteMapping("/admins/{key}")
	public ResponseEntity<String> deleteAdminHandler(@PathVariable("key") String key)
			throws AdminException, LoginException {

		String updatedUser = adminService.deleteAdminAccount(key);

		return new ResponseEntity<String>(updatedUser, HttpStatus.OK);

	}
    
	@PostMapping("/adminLogin")
	public ResponseEntity<CurrentUserSession> loginAdminHandler(@Valid @RequestBody AdminDto admin) throws LoginException {

		CurrentUserSession res = adminService.loginAdmin(admin);

		return new ResponseEntity<CurrentUserSession>(res, HttpStatus.OK);

	}
    
	@PostMapping("/adminLogout/{key}")
	public ResponseEntity<String> logoutAdminHandler(@PathVariable("key") String key) throws LoginException {

		String res = adminService.logoutAdmin(key);

		return new ResponseEntity<String>(res, HttpStatus.OK);

	}
}
