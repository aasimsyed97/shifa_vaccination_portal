



package com.masai.service;

import java.util.List;

import com.masai.dto.CurrentUserSession;
import com.masai.dto.UserDto;
import com.masai.dto.VaccineRegistrationDto;
import com.masai.exception.LoginException;
import com.masai.exception.VaccineRegistrationException;
import com.masai.model.Member;
import com.masai.model.VaccineRegistration;

public interface VaccineRegistrationService {
    public VaccineRegistrationDto getVaccineRegistrationByMobileNo(String mobileNo) throws VaccineRegistrationException;


    public List<Member> getAllMemberByMobileNo(String panoNo) throws VaccineRegistrationException;


    public VaccineRegistration addVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccineRegistrationException;

    public VaccineRegistration updateVaccineRegistration(String key,VaccineRegistration vaccineRegistration) throws LoginException,VaccineRegistrationException;

    public String deleteVaccineRegistration(String key) throws LoginException,VaccineRegistrationException;
    
    public CurrentUserSession loginUsear(UserDto usear) throws LoginException;
	
   	public String logoutUsear(String key) throws LoginException;
}