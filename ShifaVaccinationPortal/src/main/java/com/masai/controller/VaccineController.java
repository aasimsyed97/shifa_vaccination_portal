package com.masai.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.LoginException;
import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;
import com.masai.service.VaccineService;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {

    @Autowired
    private VaccineService vaccineService;
    
    @GetMapping("/{name}")
	public ResponseEntity<Vaccine> getVaccineByNameHandler(@PathVariable("name") String name) throws VaccineException{

    	Vaccine existingMember = vaccineService.getVaccineByName(name);

		return new ResponseEntity<Vaccine>(existingMember, HttpStatus.OK);

	}
    
    @GetMapping("/Vaccine")
   	public ResponseEntity<Vaccine> getVaccineByIdHandler(@RequestParam("vaccineld") int vaccineld) throws VaccineException{

       	Vaccine existingMember = vaccineService.getVaccineById(vaccineld);

   		return new ResponseEntity<Vaccine>(existingMember, HttpStatus.OK);
   	}
    
    @PostMapping("/add")
    public ResponseEntity<Vaccine> addVaccine(@Valid @RequestBody Vaccine app, @RequestParam("key") String key) throws VaccineException,LoginException{
        Vaccine saved = vaccineService.addVaccine(app,key);
        return new ResponseEntity<Vaccine>(saved, HttpStatus.CREATED);
    }
    
    @GetMapping("/allVaccines")
    public ResponseEntity<List<Vaccine>> getVaccine() throws VaccineException {
    	List<Vaccine> getapp = vaccineService.getAllVaccine();
        return new ResponseEntity<List<Vaccine>>(getapp, HttpStatus.FOUND);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Vaccine> updateAppointment(@Valid @RequestBody Vaccine app, @RequestParam("key") String key) throws VaccineException,LoginException{
        Vaccine getCus = vaccineService.updateVaccine(app,key);
        return new ResponseEntity<Vaccine>(getCus, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAppointment(@PathVariable("id") Integer id, @RequestParam("key") String key) throws VaccineException,LoginException{
        String getCus = vaccineService.deleteVaccine(id,key);
        return new ResponseEntity<String>(getCus, HttpStatus.OK);
    }
}