package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.CurrentUserSession;
import com.masai.exception.LoginException;
import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;
import com.masai.repository.AdminRepo;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.VaccineRepo;

@Service
public class VaccineServiceImpl implements VaccineService{
    @Autowired
    private VaccineRepo vaccineRepo;
    @Autowired
    private CurrentUserSessionRepo currentUserSessionRepo;
    @Autowired
    private AdminRepo adminRepo;
    
	@Override
	public Vaccine getVaccineByName(String vaccineName) throws VaccineException {
		Vaccine vv = vaccineRepo.findByVaccninName(vaccineName);
		if(vv==null) {
			throw new VaccineException("Non vaccine found with this vaccine name "+vaccineName);
		}else {
			return vv;
		}
		
	}
	
	@Override
	public Vaccine getVaccineById(int vaccineId) throws VaccineException {
		Optional<Vaccine> vv = vaccineRepo.findById(vaccineId);
		if(vv.isEmpty()) {
			throw new VaccineException("Non vaccine found with this vaccine id "+vaccineId);
		}else {
			Vaccine v1 = vv.get();
			return v1;
		}
	}
	
	@Override
	public Vaccine addVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
		if(loggedInUser!=null) {
		if(loggedInUser.getAdmin()==true) {
			Optional<Vaccine> vv = vaccineRepo.findById(vaccine.getVaccineId());
				if(vv.isPresent()) {
					throw new VaccineException("vaccine already present ");
				}else {
					return vaccineRepo.save(vaccine);
					  
				}
			
		}else{
			throw new LoginException("Person logged in is not admin");
		}
		}else {
			throw new LoginException("To add vaccine login first ");
		}
	}
	
	@Override
	public Vaccine updateVaccine(Vaccine vaccine, String key) throws VaccineException, LoginException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
		if(loggedInUser!=null) {
		if(loggedInUser.getAdmin()==true) {
			Optional<Vaccine> vv = vaccineRepo.findById(vaccine.getVaccineId());
				if(vv.isPresent()) {
					vaccineRepo.save(vaccine);
					return vaccine;
				}else {
					throw new VaccineException("No vaccine found with this vaccine ID ");
					
					  
				}
			
		}else{
			throw new LoginException("Person logged in is not admin");
		}
		}else {
			throw new LoginException("To update vaccine login first ");
		}
	}
	
	
	@Override
	public String deleteVaccine(int vaccineId, String key) throws VaccineException, LoginException {
		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
		if(loggedInUser!=null) {
		if(loggedInUser.getAdmin()==true) {
			Optional<Vaccine> vv = vaccineRepo.findById(vaccineId);
				if(vv.isPresent()) {
					Vaccine v1 = vv.get();
					vaccineRepo.delete(v1);;
					return "Vaccine deleted successfully";
				}else {
					throw new VaccineException("No vaccine found with this vaccine ID ");
					
					  
				}
			
		}else{
			throw new LoginException("Person logged in is not admin");
		}
		}else {
			throw new LoginException("To delete vaccine login first ");
		}
	}
	@Override
	public List<Vaccine> getAllVaccine() throws VaccineException {
		List<Vaccine> vv1 = vaccineRepo.findAll();
		if(vv1.isEmpty()) {
			throw new VaccineException("No vaccine found ");
		}else {
			return vv1;
		}
	}
}