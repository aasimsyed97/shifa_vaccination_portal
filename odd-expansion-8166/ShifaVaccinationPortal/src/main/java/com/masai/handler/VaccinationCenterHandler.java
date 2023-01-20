package com.masai.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.masai.model.VaccinationCenter;
import com.masai.service.VaccinationCenterService;

public class VaccinationCenterHandler {
 
	@Autowired
	private VaccinationCenterService vcService; 
	
	@GetMapping("/VaccinationCenters")
	public ResponseEntity<List<VaccinationCenter>> getAllVaccinationCenterhandler(){ 
		
		 List<VaccinationCenter> vclist= vcService.getAllVaccinationCenter();
		 
		 return new ResponseEntity<List<VaccinationCenter>>(vclist,HttpStatus.OK);
	}
}
