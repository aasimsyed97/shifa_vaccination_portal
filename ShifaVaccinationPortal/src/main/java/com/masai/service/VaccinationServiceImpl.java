package com.masai.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.VaccinationCenterException;
import com.masai.model.VaccinationCenter;
import com.masai.repository.VaccinationCenterRepo;

@Service
public class VaccinationServiceImpl  implements VaccinationCenterService{

	 @Autowired
	  private VaccinationCenterRepo vcRepo;
	
	@Override
	public List<VaccinationCenter> getAllVaccinationCenter() {
		// TODO Auto-generated method stub 
		  List<VaccinationCenter> vclist = vcRepo.findAll();
		    if(vclist.size()==0) { 
		    	throw new VaccinationCenterException(" Vaccination Center not found");
		    	
		    }
		 
		return vclist;
	}

	@Override
	public VaccinationCenter getVaccinCenterById(Integer centerid) throws VaccinationCenterException {
		// TODO Auto-generated method stub 
		     Optional<VaccinationCenter> opt = vcRepo.findById(centerid); 
		      if(opt.isPresent()) { 
		    	  VaccinationCenter vc = opt.get();
		    	  return vc;
		      }
		      else { 
		    	  throw new VaccinationCenterException("Vaccination center not found");
		      }
	}

	@Override
	public VaccinationCenter addVaccinationCenter(VaccinationCenter center) {
		// TODO Auto-generated method stub 
		
		    VaccinationCenter vc = vcRepo.save(center);
		    
		return vc;
	}

	@Override
	public VaccinationCenter updateVaccinationCenter(VaccinationCenter center) throws VaccinationCenterException {
		// TODO Auto-generated method stub 
		  Optional<VaccinationCenter> opt = vcRepo.findById(center.getCode()); 
	      if(opt.isPresent()) { 
	    	  VaccinationCenter vc = vcRepo.save(center);
	    	     
	    	    
	    	  return vc;
	      }
	      else { 
	    	  throw new VaccinationCenterException("Vaccination center not found");
	      }
		
	}

	@Override
	public VaccinationCenter deleteVaccinationCenter(VaccinationCenter center) throws VaccinationCenterException {
		// TODO Auto-generated method stub 
		 Optional<VaccinationCenter> opt = vcRepo.findById(center.getCode()); 
	      if(opt.isPresent()) { 
	    	  VaccinationCenter vc = opt.get();
	    	    vcRepo.delete(vc);
	    	     
	    	    
	    	  return vc;
	      }
	      else { 
	    	  throw new VaccinationCenterException("Vaccination center not found");
	      }
		
	}

}
