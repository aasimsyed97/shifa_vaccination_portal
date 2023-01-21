package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.CurrentUserSession;
import com.masai.exception.AdharCardException;
import com.masai.exception.IdCardException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.PanCardException;
import com.masai.exception.VaccineRegistrationException;
import com.masai.model.AdharCard;
import com.masai.model.IdCard;
import com.masai.model.Member;
import com.masai.model.PanCard;
import com.masai.model.VaccineRegistration;
import com.masai.repository.AdharCardRepo;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.IdCardRepo;
import com.masai.repository.MemberRepo;
import com.masai.repository.PanCardRepo;
import com.masai.repository.VaccineRegistrationRepo;

@Service
public class IdCardServiceImpl implements IdCardService{
    @Autowired
	private IdCardRepo idCardRepo;
    @Autowired
	private PanCardRepo panCardRepo;
	
	@Autowired
	private AdharCardRepo adharCardRepo;
	
	@Autowired
	private CurrentUserSessionRepo cuRepo;
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private VaccineRegistrationRepo vaccinationRegisterRepo;

	@Override
	public IdCard addIdCard(String key,IdCard idCard) throws LoginException,IdCardException,MemberException,VaccineRegistrationException {
	CurrentUserSession loggedInUser = cuRepo.findByUuid(key);
		if(loggedInUser!=null) {
		if(loggedInUser.getAdmin()==false) {
			Optional<VaccineRegistration> vaccineRegistration = vaccinationRegisterRepo.findById(loggedInUser.getUserId());
			if(vaccineRegistration.isPresent()) {
					VaccineRegistration vr = vaccineRegistration.get();
					Member mm1 = new Member();
					mm1.setIdcard(idCard);
					
					vr.getMember().add(mm1);
					memberRepo.save(mm1);
					return idCard;
				
			}else {
				throw new VaccineRegistrationException("No vaccine registration found ");
			}
		}else{
			throw new LoginException("Person logged in is a admin");
		}
		}else {
			throw new LoginException("To get the details login first ");
		} 
		
	}

	@Override
	public IdCard findIdCardByAdharNo(String adharNo) throws IdCardException, AdharCardException {
		AdharCard adharcard = adharCardRepo.findByadharNo(adharNo);
		if (adharcard == null) {
			throw new AdharCardException("No user found with this aadhaar card number ");
		}else {
			IdCard existingUsear =  adharcard.getIdCard();	
			return existingUsear;
	}
	}

	@Override
	public IdCard findIdCardBypanNo(String panNo) throws IdCardException, PanCardException {

		PanCard pacrdno = panCardRepo.findBypanoNo(panNo);
		if (pacrdno == null) {
			throw new PanCardException("No user found with this pan card number ");
		}else {
            IdCard existingUsear =  pacrdno.getIdCard();
			return existingUsear;

		}
	}
	
	}
