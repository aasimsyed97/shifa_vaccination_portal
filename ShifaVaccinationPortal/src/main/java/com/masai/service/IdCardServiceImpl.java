package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.AadhaarCardException;
import com.masai.exception.IdCardException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.PanCardException;
import com.masai.exception.VaccinationRegistrationException;
import com.masai.model.IdCard;
import com.masai.model.Member;
import com.masai.model.PanCard;
import com.masai.model.VaccineRegistration;
import com.masai.repository.AdharCardRepo;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.IdCardRepo;
import com.masai.repository.MemberRepo;
import com.masai.repository.PanCardRepo;
import com.masai.repository.VaccinationRegisterRepo;

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
	private VaccinationRegisterRepo vaccinationRegisterRepo;

	@Override
	public IdCard addIdCard(String key,IdCard idCard) throws LoginException,IdCardException,MemberException,VaccinationRegistrationException {
		CurrentUserSession loggedInUser = cuRepo.findByUuid(key);
		if(loggedInUser!=null) {
		if(loggedInUser.getAdmin()==false) {
			Optional<VaccineRegistration> vaccineRegistration = vaccineRegistration.findById(loggedInUser.getUserId());
			if(vaccineRegistration.isPresent()) {
					VaccineRegistration vr = vaccineRegistration.get();
					Member mm1 = new Member();
					mm1.setIdCard(idCard);
					
					vr.getMember().add(mm1);
					memberRepo.save(mm1);
					return idCard;
				
			}else {
				throw new VaccinationRegistrationException("No vaccine registration found ");
			}
		}else{
			throw new LoginException("Person logged in is a admin");
		}
		}else {
			throw new LoginException("To get the details login first ");
		}
	}

	@Override
	public IdCard findIdCardByAdharNo(String adharNo) throws IdCardException, AadhaarCardException {
		AdharCard adharcard = adharCardRepo.findByadharNo(adharNo);
		if (adharcard == null) {
			throw new AadhaarCardException("No user found with this aadhaar card number ");
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
