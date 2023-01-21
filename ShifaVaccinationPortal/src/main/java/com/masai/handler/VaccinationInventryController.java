package com.masai.handler;

import java.time.LocalDate;
import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.VaccineInventory;
import com.masai.service.VaccineInventryService;

@RestController
public class VaccinationInventryController {
	
	@Autowired
	private VaccineInventryService inventryService;
	
	@GetMapping("/vaccinationInventry")
	public ResponseEntity<List<VaccineInventory>> getAllVaccineInventry(){
		 
		List<VaccineInventory> inventories=inventryService.allVaccineInventry();
		return new ResponseEntity<List<VaccineInventory>>(inventories,HttpStatus.ACCEPTED);
	}

	
	@PostMapping("/vaccinationInventry")
	public ResponseEntity<VaccineInventory> addVaccineInventry(@Valid @RequestBody VaccineInventory inventory){
		 
		VaccineInventory inventories=inventryService.addVaccineCount(inventory);
		return new ResponseEntity<VaccineInventory>(inventories,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/vaccinationInventry")
	public ResponseEntity<VaccineInventory> updateVaccineInventry(@Valid @RequestBody VaccineInventory inventory){
		 
		VaccineInventory inventories=inventryService.updateVaccineInventry(inventory);
		return new ResponseEntity<VaccineInventory>(inventories,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/vaccinationInventry")
	public ResponseEntity<VaccineInventory> deleteVaccineInventry(@Valid @RequestBody VaccineInventory inventory){
		 
		VaccineInventory inventories=inventryService.deleteVaccineInventry(inventory);
		return new ResponseEntity<VaccineInventory>(inventories,HttpStatus.ACCEPTED);
	}
	
	
	@PutMapping("/vaccinationInventry/{date}")
	public ResponseEntity<List<VaccineInventory>> getVaccineInventryBydate(@PathVariable("date") LocalDate inventory){
		 
		List<VaccineInventory> inventories=inventryService.getVaccineInventryByDate(inventory);
		return new ResponseEntity<List<VaccineInventory>>(inventories,HttpStatus.ACCEPTED);
	}

	
	
}
