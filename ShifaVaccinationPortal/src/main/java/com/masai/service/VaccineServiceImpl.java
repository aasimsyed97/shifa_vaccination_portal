package com.masai.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.LoginException;
import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;
import com.masai.repository.VaccineRepo;

@Service
public class VaccineServiceImpl implements VaccineService{

	@Override
	public List<Vaccine> getAllVaccine() throws VaccineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine getVaccinByName(String vaccineName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine getVaccineById(Integer vaccineId) throws VaccineException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine addVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vaccine updateVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
		// TODO Auto-generated method stub
		return false;
	}
//	
//	
//	@Autowired
//	private VaccineRepo vRepo;
//	
//	
////	@Autowired
////	private CurrentUserSessionRepo currentUserSessionRepo;
////	
////	@Autowired
////	private AdminSessionRepo adminSessionRepo;
////
////	@Autowired
////	private UserRepo userRepo;
////	
////	@Autowired	
////	private AdminSessionRepo adminRepo;
////	
////	@Autowired
////	private VaccinationCenterRepo vcRepo;
//	
//
//	@Override
//	public List<Vaccine> getAllVaccine() throws VaccineException {
//		
//	}
//
//	@Override
//	public Vaccine getVaccinByName(String vaccineName) {
//		Optional<Vaccine> v=vRepo.findByVaccineName(vaccineName);
//		
//		if(!v.isPresent()) {
//			throw new VaccineException("Vaccine does not present");
//		}
//		
//		return v.get();
//		
//	}
//
//	
//	
//	
//	
//	@Override
//	public Vaccine getVaccineById(Integer vaccineId) throws VaccineException {
//
//		
//		Optional<Vaccine> v = vRepo.findById(vaccineId);
//		
//		return v.orElseThrow(()->new VaccineException("No vaccine present with vaccine id : "+vaccineId));
//	}
//
//	
//	
//	
//	
//	@Override
//	public Vaccine addVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException{
//		
//		
//CurrentAdminSession currentAdminSession = adminSessionRepo.findByUuid(key);
//		
//		if(currentAdminSession.equals(null)) {
//			
//			throw new LoginException("Admin not logged in !");
//			
//		}
//		
//		
//		Vaccine savedvaccine=vRepo.save(vaccine);
//
//		return savedvaccine;
//		
//	}
//
//	
//	
//	
//	
//	@Override
//	public Vaccine updateVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
//
//
//CurrentAdminSession currentAdminSession = adminSessionRepo.findByUuid(key);
//		
//		if(currentAdminSession.equals(null)) {
//			
//			throw new LoginException("Admin not logged in !");
//			
//		}
//		
//		Optional<Vaccine> opt=vRepo.findById(vaccine.getVaccineId());
//		 if(!opt.isPresent()) {
//			 throw new VaccineException("Vaccine not present with vaccine id");
//		 }
//		Vaccine uvaccine =opt.get();
//		
//		uvaccine.setVaccineId(vaccine.getVaccineId());
//		uvaccine.setDescription(vaccine.getDescription());
//		uvaccine.setVaccineCount(vaccine.getVaccineCount());
//		uvaccine.setVaccineName(vaccine.getVaccineName());
//		
//		return uvaccine;
//		
//	}
//
//	
//	
//	
//	@Override
//	public boolean deleteVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
//		
//CurrentAdminSession currentAdminSession = adminSessionRepo.findByUuid(key);
//		
//		if(currentAdminSession.equals(null)) {
//			
//			throw new LoginException("Admin not logged in !");
//			
//		}
//		
//	Optional<Vaccine> deletedvaccine =	Optional.empty();
//		
//	if(deletedvaccine.isPresent()) {
//		return true;
//	}else {
//		throw new VaccineException("Vaccine not present with id : " + vaccine.getVaccineId());
//	}
//		
//	}
//	

	
	
}