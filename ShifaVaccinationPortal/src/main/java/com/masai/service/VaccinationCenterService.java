package com.masai.service;

import java.util.List; 

import com.masai.exception.VaccinationCenterException;
import com.masai.model.VaccinationCenter;
import com.masai.repository.VaccinationCenterRepo;

public interface VaccinationCenterService {
 
	
	  public List<VaccinationCenter> getAllVaccinationCenter ();
	  public VaccinationCenter getVaccinCenterById(Integer centerid)throws VaccinationCenterException;
     public  VaccinationCenter addVaccinationCenter(VaccinationCenter center);
     public  VaccinationCenter updateVaccinationCenter(VaccinationCenter center)throws VaccinationCenterException; 
     public VaccinationCenter deleteVaccinationCenter(VaccinationCenter center)throws VaccinationCenterException;

}


