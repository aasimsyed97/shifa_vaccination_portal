package com.masai.service;

import com.masai.exception.AppointmentException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.VaccinationCenterException;
import com.masai.model.Appointment;

public interface AppointmentServices {
//    public Appointment getAppointment(Integer bookingid) throws AppointmentException;
//
//    public String addAppointment(Appointment app) throws AppointmentException;
//
//    public String updateAppointment(Appointment app) throws AppointmentException;
//
//    public String deleteAppointment(Appointment app) throws AppointmentException;

    public Appointment addAppointment(Appointment app ,String key,String adharNo,int vaccinationCentercode) throws MemberException,AppointmentException,LoginException,VaccinationCenterException ;

    public Appointment updateAppointment(Appointment app,String key,String adharNo,int vaccinationCentercode) throws MemberException, AppointmentException, LoginException,VaccinationCenterException ;

    public Appointment deleteAppointment(Appointment app,String key,String adharNo,int vaccinationCentercode) throws MemberException, AppointmentException, LoginException,VaccinationCenterException ;
    
    public Appointment getAppointment(int bookingid) throws AppointmentException;

    
}
