package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;






@ControllerAdvice
public class GlobalExceptionHandler {
	
 

	//to handle Not found exception 
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req)  {
			
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
					
	}
 

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
		
		@ExceptionHandler(LoginException.class)
		public ResponseEntity<MyErrorDetails> myAdminException(AdminException ie, WebRequest req){
			
			MyErrorDetails err = new MyErrorDetails();
			err.setTimestamp(LocalDateTime.now());
			err.setMessage(ie.getMessage());
			err.setDetails(req.getDescription(false));
			
			return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		}
		
	
		
		
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),"Validation Error",me.getBindingResult().getFieldError().getDefaultMessage());
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(AdharCardException.class)
	public ResponseEntity<MyErrorDetails> adharCardExpHandler(AdharCardException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	} 
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorDetails> adminExpHandler(AdminException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(IdCardException.class)
	public ResponseEntity<MyErrorDetails> idCardExpHandler(IdCardException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(LoginException.class)
	public ResponseEntity<MyErrorDetails> loginExpHandler(LoginException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	

	@ExceptionHandler(MemberException.class)
	public ResponseEntity<MyErrorDetails> MemberExpHandler(MemberException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(PanCardException.class)
	public ResponseEntity<MyErrorDetails> panCardExpHandler(PanCardException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	} 
	
	@ExceptionHandler(VaccineInventoryException.class)
	public ResponseEntity<MyErrorDetails> VaccinInventoryExpHandler(VaccineInventoryException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	 

	@ExceptionHandler(VaccineRegistrationException.class)
	public ResponseEntity<MyErrorDetails> VaccineRegistrationExpHandler(VaccineRegistrationException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}

	
	@ExceptionHandler(VaccinationCenterException.class)
	public ResponseEntity<MyErrorDetails> VaccinationCenterExpHandler(VaccinationCenterException ie,WebRequest req){
		
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	

			

}
