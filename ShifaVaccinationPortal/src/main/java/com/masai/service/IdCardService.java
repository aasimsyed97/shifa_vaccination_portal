package com.masai.service;

import com.masai.exception.AadhaarCardException;
import com.masai.exception.IdCardException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.PanCardException;
import com.masai.exception.VaccinationRegistrationException;
import com.masai.model.IdCard;


public interface IdCardService {
	public IdCard addIdCard(String key,IdCard idCard) throws LoginException,IdCardException,MemberException,VaccinationRegistrationException;
	
	public IdCard findIdCardByAdharNo(String adharNo) throws IdCardException,AadhaarCardException;
	
	public IdCard findIdCardBypanNo(String panNo) throws IdCardException,PanCardException;
}
