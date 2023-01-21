//
//package com.masai.handler;
//
//import java.util.List;
//
//
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.masai.model.*;
//import com.masai.service.VaccinationRegisterService;
//@RestController
//public class VaccinationRegistrationController {
//	
//	@Autowired
//	private VaccinationRegisterService registerService;
//	
//	
//	
//	@GetMapping("/VaccinationRegistration")
//	public ResponseEntity<List<VaccineRegistration>> getAllVaccinationRegistrations(){
//		 
//		List<VaccineRegistration> vaccineRegistrations=registerService.allVaccinationRegistrations();
//		
//		return new ResponseEntity<List<VaccineRegistration>>(vaccineRegistrations,HttpStatus.ACCEPTED);
//	}
//	
//	
//	
//	@GetMapping("/VaccinationRegistration/{mobile}")
//	public ResponseEntity<VaccineRegistration> getVaccinationRegistration(@PathVariable Long mobile){
//		VaccineRegistration registration=registerService.getVaccinationRegistration(mobile);
//		return new ResponseEntity<VaccineRegistration>(registration,HttpStatus.OK);
//	}
//
//	
//	
//	
//	@GetMapping("/VaccinationRegistration/getMember")
//	public ResponseEntity<List<Member>> getMember(){
//		List<Member> members=registerService.getAllMember();
//		return new ResponseEntity<List<Member>>(members,HttpStatus.OK);
//	}
//	
//	
//	@PostMapping("VaccinationRegistration")
//	public ResponseEntity<VaccineRegistration> addVaccinationRegistration(@Valid @RequestBody VaccineRegistration registration){
//		VaccineRegistration registration2=registerService.addVaccineRegistration(registration);
//		return new ResponseEntity<VaccineRegistration>(registration2,HttpStatus.OK);
//	}
//	
//	
//	
//	
//	
//}


package com.masai.handler;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.*;
import com.masai.service.VaccineRegistrationService;
@RestController
public class VaccinationRegistrationController {
	
//	@Autowired
//	private VaccinationRegisterService registerService;
//	
//	
//	
//	@GetMapping("/VaccinationRegistration")
//	public ResponseEntity<List<VaccineRegistration>> getAllVaccinationRegistrations(){
//		 
//		List<VaccineRegistration> vaccineRegistrations=registerService.allVaccinationRegistrations();
//		
//		return new ResponseEntity<List<VaccineRegistration>>(vaccineRegistrations,HttpStatus.ACCEPTED);
//	}
//	
//	
//	
//	@GetMapping("/VaccinationRegistration/{mobile}")
//	public ResponseEntity<VaccineRegistration> getVaccinationRegistration(@PathVariable Long mobile){
//		VaccineRegistration registration=registerService.getVaccinationRegistration(mobile);
//		return new ResponseEntity<VaccineRegistration>(registration,HttpStatus.OK);
//	}
//
//	
//	
//	
//	@GetMapping("/VaccinationRegistration/getMember")
//	public ResponseEntity<List<Member>> getMember(){
//		List<Member> members=registerService.getAllMember();
//		return new ResponseEntity<List<Member>>(members,HttpStatus.OK);
//	}
//	
//	
//	@PostMapping("/VaccinationRegistration")
//	public ResponseEntity<VaccineRegistration> addVaccinationRegistration(@Valid @RequestBody VaccineRegistration registration){
//		VaccineRegistration registration2=registerService.addVaccineRegistration(registration);
//		return new ResponseEntity<VaccineRegistration>(registration2,HttpStatus.OK);
//	}
//	
//	
//	
	
	
}


