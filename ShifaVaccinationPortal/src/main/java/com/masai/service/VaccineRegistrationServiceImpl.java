//
//package com.masai.service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.masai.exception.VaccinationCenterException;
//import com.masai.exception.VaccinationRegistrationException;
//import com.masai.model.Member;
//import com.masai.model.VaccinationCenter;
//import com.masai.model.VaccineRegistration;
//import com.masai.repository.VaccinationRegisterRepo;
//
//public class VaccinationRegisterServiceImpl implements VaccinationRegisterService {
//	
//	
//	@Autowired
//	VaccinationRegisterRepo vaccinationRegisterRepo;
//	
//	
//	
//	@Override
//	public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException {
//		
//	List<VaccineRegistration> vaccineRegistrations=	vaccinationRegisterRepo.findAll();
//	
//	if(vaccineRegistrations.isEmpty()) {
//		throw new VaccinationRegistrationException("VaccinationRegistrations Data not find..");
//	}else {
//		return vaccineRegistrations;
//	}
//	
//	}
//
//	
//	
//	
//	@Override
//	public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException {
//		    
//	   Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
//	   if(optional.isEmpty()) {
//		   throw new VaccinationRegistrationException("VaccinationRegistration data not find by mobile number..");
//	   }else {
//		   VaccineRegistration vaccineRegistration=optional.get();
//		   return vaccineRegistration;
//	   }
//	}
//	
//	
//	
//
//	@Override
//	public List<Member> getAllMember() throws VaccinationRegistrationException {
//		List<VaccineRegistration> vaccineRegistrations=vaccinationRegisterRepo.findAll();
//		if(vaccineRegistrations.isEmpty()) {
//			throw new VaccinationRegistrationException("Member data not find...");
//		}else {
//			
//		List<Member> memberList=new ArrayList<>();
//		for(VaccineRegistration i:vaccineRegistrations) {
//			
//				memberList=i.getMemberlist();
//		}
//		return memberList;
//	  }
//	}
//
//	
//	
//	
//	
//	@Override
//	public VaccineRegistration addVaccineRegistration(VaccineRegistration registration)throws VaccinationRegistrationException {
//		
//	   VaccineRegistration vaccineRegistration=vaccinationRegisterRepo.save(registration);
//	   if(vaccineRegistration==null) {
//		   throw new VaccinationRegistrationException("VaccinationRegister data not saved..");
//	   }else {
//		   return vaccineRegistration;
//	   }
//	}
//
//	
//	
//	
//	
//	@Override
//	public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration)throws VaccinationRegistrationException {
//	   
//		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(vaccineRegistration.getMobileNo());
//		if(optional.isEmpty()) {
//			VaccineRegistration registration=optional.get();
//			vaccinationRegisterRepo.save(registration);
//			return registration;
//		}else {
//			throw new VaccinationRegistrationException("VaccinationRegistration Data not updated..");
//		}
//	}
//
//	
//	
//	
//	@Override
//	public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException {
//		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
//		if(optional.isEmpty()) {
//			throw new VaccinationRegistrationException("VaccinationRegistration data not deleted...");
//		}else {
//			VaccineRegistration registration=optional.get();
//			vaccinationRegisterRepo.delete(registration);
//			return true;
//			
//		}
//	
//	}
//
//	
//	
//	
//}

package com.masai.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.CurrentUserSession;
import com.masai.dto.UserDto;
import com.masai.dto.VaccineRegistrationDto;
import com.masai.exception.LoginException;
import com.masai.exception.VaccineRegistrationException;
import com.masai.model.Member;
import com.masai.model.VaccineRegistration;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.VaccineRegistrationRepo;

import net.bytebuddy.utility.RandomString;

@Service
public class VaccineRegistrationServiceImpl implements VaccineRegistrationService{
	@Autowired
	private VaccineRegistrationRepo vaccineRegistrationRepo;
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	
	@Override
	public VaccineRegistrationDto getVaccineRegistrationByMobileNo(String MobileNo) throws VaccineRegistrationException {
		VaccineRegistration vaccineRegistration = vaccineRegistrationRepo.findBymobileno(MobileNo);
		if(vaccineRegistration == null) {
			throw new VaccineRegistrationException("No vaccine registration found with this mobile number - "+MobileNo);
		}else {
			VaccineRegistrationDto VrDto = new VaccineRegistrationDto();
			  VrDto.setMobileno(vaccineRegistration.getMobileno());
			  VrDto.setRegistrationId(vaccineRegistration.getRegistrationId());
			  
			  return VrDto;
		}
	}

	@Override
	public List<Member> getAllMemberByMobileNo(String panoNo) throws VaccineRegistrationException {

		VaccineRegistration vaccineRegistration = vaccineRegistrationRepo.findBymobileno(panoNo);
		if(vaccineRegistration == null) {
			throw new VaccineRegistrationException("No vaccine registration found with this mobile number - "+panoNo);
		}else {
			List<Member> member = vaccineRegistration.getMember();
			if(member.isEmpty()) {
				throw new VaccineRegistrationException("No members found ");
			}
			return member;
		}
	}

	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration vaccineRegistration)
			throws VaccineRegistrationException {
		VaccineRegistration registration = vaccineRegistrationRepo.findBymobileno(vaccineRegistration.getMobileno());
		if(registration == null) {
			return vaccineRegistrationRepo.save(vaccineRegistration);
		}else {
			throw new VaccineRegistrationException("Registration already exist with this mobile number  - "+vaccineRegistration.getMobileno());
		}
	}

	@Override
	public VaccineRegistration updateVaccineRegistration(String key,VaccineRegistration vaccineRegistration)
			throws LoginException,VaccineRegistrationException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);

		if (loggedInUser == null) {
			throw new LoginException("Please provide a valid key to update vaccine registration");
		}

		else{
			Optional<VaccineRegistration> registration = vaccineRegistrationRepo.findById(loggedInUser.getUserId());
			VaccineRegistration vr = registration.get();
			vr.setPassword(vaccineRegistration.getPassword());
			vr.setMobileno(vaccineRegistration.getMobileno());
			return vaccineRegistrationRepo.save(vr);
		}
	}

	@Override
	public String deleteVaccineRegistration(String key) throws LoginException,VaccineRegistrationException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);

		if (loggedInUser == null) {
			throw new LoginException("Please provide a valid key to delete Account");
		}
		Optional<VaccineRegistration> dto = vaccineRegistrationRepo.findById(loggedInUser.getUserId());
		
		if (dto.isEmpty()) {
			throw new VaccineRegistrationException("Invalid Usear Details, please login first");
		}
		
		VaccineRegistration existingUsear = dto.get();
			

		vaccineRegistrationRepo.delete(existingUsear);

		return "Account deleted..";
	}

	@Override
	public CurrentUserSession loginUsear(UserDto user) throws LoginException {
		VaccineRegistration registration = vaccineRegistrationRepo.findBymobileno(user.getPanNo());

		if (registration == null) {
			throw new LoginException("Wrong credentials provided ");	
		}
		

		Optional<CurrentUserSession> CurrentUserSessionOpt = currentUserSessionRepo.findById(registration.getRegistrationId());

		if (CurrentUserSessionOpt.isPresent() && registration.getPassword().equals(user.getUserPassword())) {
			currentUserSessionRepo.delete(CurrentUserSessionOpt.get());
		}

		if (registration.getPassword().equals(user.getUserPassword())) {

			String key = RandomString.make(6);

			Boolean isAdmin = false;

			CurrentUserSession currentUserSession = new CurrentUserSession(registration.getRegistrationId(), key, isAdmin,
					LocalDateTime.now());

			currentUserSessionRepo.save(currentUserSession);

			return currentUserSession;
		} else {
			throw new LoginException("Please Enter a valid password");
		}
	}

	@Override
	public String logoutUsear(String key) throws LoginException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);

		if (loggedInUser == null) {
			throw new LoginException("Please provide a valid key to logout admin");
		}
		currentUserSessionRepo.delete(loggedInUser);
		return "Logged Out !";
	}

}