package com.masai.handler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.LoginException;
import com.masai.model.Vaccine;
import com.masai.service.VaccineService;

@RestController
public class VaccineHandler {


	@Autowired
	private VaccineService vService;
	
	
	
	
	@PostMapping("/vaccines")
	public ResponseEntity<Vaccine> addVaccine(@Valid @RequestBody Vaccine vaccine ,@RequestParam("key")String key)throws LoginException{
		
	Vaccine savedvaccine =	vService.addVaccine(vaccine,key);
		
	return new ResponseEntity<Vaccine>(savedvaccine,HttpStatus.CREATED);
		
	}
	
	
	
	
	@PutMapping("/vaccines")
	public ResponseEntity<Vaccine> updateVaccine(@RequestBody Vaccine vaccine ,@RequestParam("key") String key)throws LoginException{
		
	Vaccine savedvaccine =	vService.updateVaccine(vaccine,key);
		
	return new ResponseEntity<Vaccine>(savedvaccine,HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("/vaccines/{vaccinename}")
	public ResponseEntity<Vaccine> getVaccineByName(@PathVariable("vaccinename") String vaccinename){
		
	Vaccine savedvaccine =	vService.getVaccinByName(vaccinename);
		
	return new ResponseEntity<Vaccine>(savedvaccine,HttpStatus.OK);
		
	}
	
	
	
	
	@GetMapping("/vaccinesById/{vaccinid}")
	public ResponseEntity<Vaccine> getVaccineByID(@PathVariable("vaccinid") Integer vaccinid){
		
	Vaccine savedvaccine =	vService.getVaccineById(vaccinid);
		
	return new ResponseEntity<Vaccine>(savedvaccine,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	
}
