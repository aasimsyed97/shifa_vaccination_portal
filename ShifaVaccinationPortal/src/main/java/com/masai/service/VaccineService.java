package com.masai.service;
import java.util.List;

import com.masai.model.Vaccine;
import com.masai.exception.LoginException;
import com.masai.exception.VaccineException;
import com.masai.repository.VaccineRepo;

public interface VaccineService {
    public Vaccine getVaccineByName(String vaccineName) throws VaccineException;

    public Vaccine getVaccineById(int vaccineId) throws VaccineException;

    public Vaccine addVaccine(Vaccine vaccine,String key) throws VaccineException,LoginException;

    public Vaccine updateVaccine(Vaccine vaccine,String key) throws VaccineException,LoginException;

    public String deleteVaccine(int vaccineId,String key) throws VaccineException,LoginException;

    public List<Vaccine> getAllVaccine() throws  VaccineException;
}