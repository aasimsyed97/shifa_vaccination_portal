package com.masai.service;

import java.util.List;

import com.covid.exception.MemberNotFoundException;
import com.covid.exception.MemberNotRegisterException;
import com.covid.model.Member;
public interface MemberServices {
	
    public Member getMemberByld(String key,int idcardid) throws LoginException,MemberException,IdCardException;
    
    public Member getMemberByAdharNo(String adharno) throws MemberException,AdharCardException;
    
    public Member getMemberByPanNo(String panNo) throws MemberException,PanCardException;
    
    public Member addMember(String key,Member member) throws LoginException,MemberException,VaccineRegistrationException;
    
    public Member updateMember(String key,int idcardid,MemberUpdateDto MemberUpdateDto) throws LoginException,IdCardException,MemberException,VaccineRegistrationException;
    
    public Member deleteMember(String key,int idcardid) throws LoginException,MemberException,IdCardException,VaccineRegistrationException;

}
