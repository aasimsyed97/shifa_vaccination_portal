
package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.VaccinationCenterException;
import com.masai.exception.VaccinationRegistrationException;
import com.masai.model.Member;
import com.masai.model.VaccinationCenter;
import com.masai.model.VaccineRegistration;
import com.masai.repository.VaccinationRegisterRepo;

public class VaccinationRegisterServiceImpl implements VaccinationRegisterService {
	
	
	@Autowired
	VaccinationRegisterRepo vaccinationRegisterRepo;
	
	
	
	@Override
	public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException {
		
	List<VaccineRegistration> vaccineRegistrations=	vaccinationRegisterRepo.findAll();
	
	if(vaccineRegistrations.isEmpty()) {
		throw new VaccinationRegistrationException("VaccinationRegistrations Data not find..");
	}else {
		return vaccineRegistrations;
	}
	
	}

	
	
	
	@Override
	public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException {
		    
	   Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
	   if(optional.isEmpty()) {
		   throw new VaccinationRegistrationException("VaccinationRegistration data not find by mobile number..");
	   }else {
		   VaccineRegistration vaccineRegistration=optional.get();
		   return vaccineRegistration;
	   }
	}
	
	
	

	@Override
	public List<Member> getAllMember() throws VaccinationRegistrationException {
		List<VaccineRegistration> vaccineRegistrations=vaccinationRegisterRepo.findAll();
		if(vaccineRegistrations.isEmpty()) {
			throw new VaccinationRegistrationException("Member data not find...");
		}else {
			
		List<Member> memberList=new ArrayList<>();
		for(VaccineRegistration i:vaccineRegistrations) {
			
				memberList=i.getMemberlist();
		}
		return memberList;
	  }
	}

	
	
	
	
	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration registration)throws VaccinationRegistrationException {
		
	   VaccineRegistration vaccineRegistration=vaccinationRegisterRepo.save(registration);
	   if(vaccineRegistration==null) {
		   throw new VaccinationRegistrationException("VaccinationRegister data not saved..");
	   }else {
		   return vaccineRegistration;
	   }
	}

	
	
	
	
	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration)throws VaccinationRegistrationException {
	   
		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(vaccineRegistration.getMobileNo());
		if(optional.isEmpty()) {
			VaccineRegistration registration=optional.get();
			vaccinationRegisterRepo.save(registration);
			return registration;
		}else {
			throw new VaccinationRegistrationException("VaccinationRegistration Data not updated..");
		}
	}

	
	
	
	@Override
	public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException {
		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
		if(optional.isEmpty()) {
			throw new VaccinationRegistrationException("VaccinationRegistration data not deleted...");
		}else {
			VaccineRegistration registration=optional.get();
			vaccinationRegisterRepo.delete(registration);
			return true;
			
		}
	
	}

	
	
	
}

package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.exception.VaccinationCenterException;
import com.masai.exception.VaccinationRegistrationException;
import com.masai.model.Member;
import com.masai.model.VaccinationCenter;
import com.masai.model.VaccineRegistration;
import com.masai.repository.VaccinationRegisterRepo;

public class VaccinationRegisterServiceImpl implements VaccinationRegisterService {
	
	
	@Autowired
	VaccinationRegisterRepo vaccinationRegisterRepo;
	
	
	
	@Override
	public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException {
		
	List<VaccineRegistration> vaccineRegistrations=	vaccinationRegisterRepo.findAll();
	
	if(vaccineRegistrations.isEmpty()) {
		throw new VaccinationRegistrationException("VaccinationRegistrations Data not find..");
	}else {
		return vaccineRegistrations;
	}
	
	}

	
	
	
	@Override
	public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException {
		    
	   Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
	   if(optional.isEmpty()) {
		   throw new VaccinationRegistrationException("VaccinationRegistration data not find by mobile number..");
	   }else {
		   VaccineRegistration vaccineRegistration=optional.get();
		   return vaccineRegistration;
	   }
	}
	
	
	

	@Override
	public List<Member> getAllMember() throws VaccinationRegistrationException {
		List<VaccineRegistration> vaccineRegistrations=vaccinationRegisterRepo.findAll();
		if(vaccineRegistrations.isEmpty()) {
			throw new VaccinationRegistrationException("Member data not find...");
		}else {
			
		List<Member> memberList=new ArrayList<>();
		for(VaccineRegistration i:vaccineRegistrations) {
			
				memberList=i.getMemberlist();
		}
		return memberList;
	  }
	}

	
	
	
	
	@Override
	public VaccineRegistration addVaccineRegistration(VaccineRegistration registration)throws VaccinationRegistrationException {
		
	   VaccineRegistration vaccineRegistration=vaccinationRegisterRepo.save(registration);
	   if(vaccineRegistration==null) {
		   throw new VaccinationRegistrationException("VaccinationRegister data not saved..");
	   }else {
		   return vaccineRegistration;
	   }
	}

	
	
	
	
	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration)throws VaccinationRegistrationException {
	   
		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(vaccineRegistration.getMobileNo());
		if(optional.isEmpty()) {
			VaccineRegistration registration=optional.get();
			vaccinationRegisterRepo.save(registration);
			return registration;
		}else {
			throw new VaccinationRegistrationException("VaccinationRegistration Data not updated..");
		}
	}

	
	
	
	@Override
	public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException {
		Optional<VaccineRegistration> optional=vaccinationRegisterRepo.findById(mobileNo);
		if(optional.isEmpty()) {
			throw new VaccinationRegistrationException("VaccinationRegistration data not deleted...");
		}else {
			VaccineRegistration registration=optional.get();
			vaccinationRegisterRepo.delete(registration);
			return true;
			
		}
	
	}

	
	
	
}

