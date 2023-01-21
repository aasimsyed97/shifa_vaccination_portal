package com.masai.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.IdCard;
import com.masai.service.IdCardService;

@RestController
public class IdCardHandler {

	@Autowired
	private IdCardService idService;
	
//	@GetMapping
//	public ResponseEntity<IdCard> getPanCardHandler(String panNumber){
//		
//		IdCard id = idService.getPanCardByNumber(panNumber);
//		
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}
//	
//	@GetMapping
//	public ResponseEntity<IdCard> getAdharCardHandler(long adharNo){
//		
//		IdCard id = idService.getAdharCardByNo(adharNo);
//		
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}
//	
//	@PostMapping
//	public ResponseEntity<IdCard> addIdCardHandler(IdCard idcard){
//		
//		IdCard id = idService.addIdCard(idcard);
//		
//		return new ResponseEntity<>(id, HttpStatus.CREATED);
//	}
}
