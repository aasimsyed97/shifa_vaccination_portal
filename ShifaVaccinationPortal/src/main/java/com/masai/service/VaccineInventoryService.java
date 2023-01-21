package com.masai.service;
import java.time.LocalDate;
import java.util.List;

import com.masai.exception.LoginException;
import com.masai.exception.VaccinationCenterException;
import com.masai.exception.VaccineInventoryException;
import com.masai.model.VaccineInventory;

public interface VaccineInventoryService {
	
	public VaccineInventory addVaccineCount(String key, int vaccineInventoryId,int vaccineCountID  )throws VaccineInventoryException,LoginException;
	
	public VaccineInventory updateVaccinelnventory(String key,int vaccineInventoryId,LocalDate date) throws LoginException, VaccineInventoryException;
	
	public VaccineInventory deleteVaccineInventory(String key,int vaccineInventoryid) throws LoginException, VaccineInventoryException;
	
	public List<VaccineInventory>  getVaccineInventoryByCenter(int vaccinationCentercode)throws VaccineInventoryException,VaccinationCenterException;
	
	public List<VaccineInventory> getVaccineInventoryByDate (LocalDate date) throws VaccineInventoryException ;

	public List<VaccineInventory>  getVaccinelnventoryByVaccineName(String vaccineName) throws VaccineInventoryException ;
}