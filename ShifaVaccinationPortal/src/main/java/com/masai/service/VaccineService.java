package com.masai.service;
import java.util.List;

import com.masai.model.Vaccine;
import com.masai.exception.LoginException;
import com.masai.exception.VaccineException;
import com.masai.repository.VaccineRepo;

public interface VaccineService {
	
    public List<Vaccine> getAllVaccine() throws VaccineException;
	
    public Vaccine getVaccinByName(String vaccineName);

	public Vaccine getVaccineById(Integer vaccineId) throws VaccineException;

	public Vaccine addVaccine(Vaccine vaccine ,String key) throws VaccineException,LoginException;
	
	public Vaccine updateVaccine(Vaccine vaccine,String key) throws VaccineException,LoginException;
	
	public boolean deleteVaccine(Vaccine vaccine,String key) throws VaccineException,LoginException;	
}