package com.masai.service;

import com.masai.exception.LoginException;
import com.masai.exception.VaccinationCenterException;
import com.masai.exception.VaccineInventoryException;
import com.masai.model.VaccinationCenter;
import com.masai.model.VaccineInventory;

public interface VaccinationCenterService {
 

	public VaccinationCenter addVaccineCenter(String key, VaccinationCenter vaccinationCenter)throws VaccinationCenterException,LoginException;
	
	public VaccinationCenter updateVaccineCenter(String key, int vaccinationCentercode, VaccineInventory vaccineInventory)throws VaccinationCenterException,VaccineInventoryException,LoginException;
	
	public VaccinationCenter deleteVaccineCenter(String key, int vaccinationCentercode)throws VaccinationCenterException,LoginException;
	
	public VaccinationCenter getVaccineCenter(int vaccinationCentercode)throws VaccinationCenterException;

}


