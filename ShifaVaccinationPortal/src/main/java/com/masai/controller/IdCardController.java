package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.AdharCardException;
import com.masai.exception.IdCardException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.PanCardException;
import com.masai.exception.VaccineRegistrationException;
import com.masai.model.IdCard;
import com.masai.service.IdCardService;

@RestController
@RequestMapping("/usearController")
public class IdCardController {
	@Autowired
	private IdCardService usearServices;
	
	
	
	@PostMapping("/usearsignup/{key}")
	public ResponseEntity<IdCard> registerIdCardHandler(@Valid @RequestBody IdCard user,@PathVariable("key") String key) throws IdCardException, LoginException, MemberException, VaccineRegistrationException {

		IdCard savedUser = usearServices.addIdCard(key, user);

		return new ResponseEntity<IdCard>(savedUser, HttpStatus.OK);

	}
	
	@GetMapping("/usearsByAdhar")
	public ResponseEntity<IdCard> getIdCardByAdharHandler(@RequestParam("adharNo") String adharNo)
			throws IdCardException, AdharCardException {

		IdCard getUser = usearServices.findIdCardByAdharNo(adharNo);

		return new ResponseEntity<IdCard>(getUser, HttpStatus.OK);

	}
	
	@GetMapping("/usearsByPan")
	public ResponseEntity<IdCard> getIdCardByPanHandler(@RequestParam("panNo") String panNo)
			throws PanCardException, IdCardException {

		IdCard getUser = usearServices.findIdCardBypanNo(panNo);

		return new ResponseEntity<IdCard>(getUser, HttpStatus.OK);

	}
}
