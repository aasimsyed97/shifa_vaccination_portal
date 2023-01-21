



package com.masai.service;

import java.util.List;

import com.masai.exception.VaccineRegistrationException;
import com.masai.model.*;

public interface VaccinationRegisterService {
  public List<VaccineRegistration> allVaccinationRegistrations() throws VaccineRegistrationException;
  public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccineRegistrationException;
  public List<Member> getAllMember() throws VaccineRegistrationException;
  public VaccineRegistration addVaccineRegistration(VaccineRegistration registration) throws VaccineRegistrationException;
  public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccineRegistrationException;
  public boolean deleteVaccineRegistration(Long mobileNo) throws VaccineRegistrationException;
  
}


