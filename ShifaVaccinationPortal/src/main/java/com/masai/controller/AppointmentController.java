package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AppointmentException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.VaccinationCenterException;
import com.masai.model.Appointment;
import com.masai.service.AppointmentServices;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentServices appointmentServices;
	
	@PostMapping("/bookAppointment")
    public ResponseEntity<Appointment> addAppointmentHandler(@Valid @RequestBody Appointment app, @RequestParam("key") String key,@RequestParam("adharNo") String adharNo,@RequestParam("vaccinationCentercode") int vaccinationCentercode) throws MemberException, AppointmentException, LoginException, VaccinationCenterException{
		
		Appointment saved = appointmentServices.addAppointment(app, key, adharNo, vaccinationCentercode);
        
		return new ResponseEntity<Appointment>(saved, HttpStatus.CREATED);
    }
	
	@PutMapping("/updateAppointment")
    public ResponseEntity<Appointment> updateAppointmentHandler(@Valid @RequestBody Appointment app, @RequestParam("key") String key,@RequestParam("adharNo") String adharNo,@RequestParam("vaccinationCentercode") int vaccinationCentercode) throws MemberException, AppointmentException, LoginException, VaccinationCenterException{
		
		Appointment update = appointmentServices.updateAppointment(app, key, adharNo, vaccinationCentercode);
        
		return new ResponseEntity<Appointment>(update, HttpStatus.OK);
    }
	
	@DeleteMapping("/deleteAppointment")
	
    public ResponseEntity<Appointment> deleteAppointmentHandler(@Valid @RequestBody Appointment app, @RequestParam("key") String key,@RequestParam("adharNo") String adharNo,@RequestParam("vaccinationCentercode") int vaccinationCentercode) throws MemberException, AppointmentException, LoginException, VaccinationCenterException{
        
		Appointment delete = appointmentServices.deleteAppointment(app, key, adharNo, vaccinationCentercode);
        
		return new ResponseEntity<Appointment>(delete, HttpStatus.OK);
    }
	
	@GetMapping("/gtappointment")
   	public ResponseEntity<Appointment> getAppointmentHandler(@RequestParam("bookingid") int bookingid) throws AppointmentException{

		Appointment vaccinationCenter = appointmentServices.getAppointment(bookingid);

   	   return new ResponseEntity<Appointment>(vaccinationCenter, HttpStatus.OK);
   	}
}
