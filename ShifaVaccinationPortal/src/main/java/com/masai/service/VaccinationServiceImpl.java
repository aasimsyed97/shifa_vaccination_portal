package com.masai.service;

import java.util.List;

import com.masai.exception.VaccinationCenterException;
import com.masai.model.VaccinationCenter;
import com.masai.repository.VaccinationCenterRepo;

public class VaccinationServiceImpl  implements VaccinationCenterService{

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

}
