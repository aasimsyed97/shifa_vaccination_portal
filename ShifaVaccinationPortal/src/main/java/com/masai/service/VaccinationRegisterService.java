
//package com.masai.service;
//
//import java.util.List;
//
//
//import com.masai.exception.VaccinationRegistrationException;
//import com.masai.model.*;
//
//public interface VaccinationRegisterService {
//  public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException;
//  public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException;
//  public List<Member> getAllMember() throws VaccinationRegistrationException;
//  public VaccineRegistration addVaccineRegistration(VaccineRegistration registration) throws VaccinationRegistrationException;
//  public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccinationRegistrationException;
//  public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException;
//  
//}


//package com.masai.service;
//
//import java.util.List;
//
//import com.masai.exception.VaccinationRegistrationException;
//import com.masai.model.*;
//
//public interface VaccinationRegisterService {
//  public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException;
//  public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException;
//  public List<Member> getAllMember() throws VaccinationRegistrationException;
//  public VaccineRegistration addVaccineRegistration(VaccineRegistration registration) throws VaccinationRegistrationException;
//  public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccinationRegistrationException;
//  public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException;
//  
//}

package com.masai.service;

import java.util.List;

import com.masai.exception.VaccinationRegistrationException;
import com.masai.model.*;

public interface VaccinationRegisterService {
  public List<VaccineRegistration> allVaccinationRegistrations() throws VaccinationRegistrationException;
  public VaccineRegistration getVaccinationRegistration(Long mobileNo) throws VaccinationRegistrationException;
  public List<Member> getAllMember() throws VaccinationRegistrationException;
  public VaccineRegistration addVaccineRegistration(VaccineRegistration registration) throws VaccinationRegistrationException;
  public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccinationRegistrationException;
  public boolean deleteVaccineRegistration(Long mobileNo) throws VaccinationRegistrationException;
  
}


