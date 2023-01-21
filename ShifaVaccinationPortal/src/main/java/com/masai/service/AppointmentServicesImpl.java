package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.CurrentUserSession;
import com.masai.exception.AppointmentException;
import com.masai.exception.LoginException;
import com.masai.exception.MemberException;
import com.masai.exception.VaccinationCenterException;
import com.masai.model.Appointment;
import com.masai.model.Member;
import com.masai.model.VaccinationCenter;
import com.masai.model.VaccineRegistration;
import com.masai.repository.AdharCardRepo;
import com.masai.repository.AppointmentRepo;
import com.masai.repository.CurrentUserSessionRepo;
import com.masai.repository.IdCardRepo;
import com.masai.repository.MemberRepo;
import com.masai.repository.PanCardRepo;
import com.masai.repository.VaccinationCenterRepo;
import com.masai.repository.VaccineRegistrationRepo;

@Service
public class AppointmentServicesImpl implements AppointmentServices{
    @Autowired
	private AppointmentRepo appointmentRepo;
	@Autowired
	private VaccineRegistrationRepo vaccineRegistrationRepo;
	
	@Autowired
	private CurrentUserSessionRepo currentUserSessionRepo;
	
	@Autowired
	private IdCardRepo idCardRepo;
	
	@Autowired
	private MemberRepo memberRepo;
	
	@Autowired
	private AdharCardRepo adharCardRepo;
	
	@Autowired
	private PanCardRepo panCardRepo;
	
	@Autowired
	private VaccinationCenterRepo vaccinationCenterRepo;
	
	@Override
	public Appointment addAppointment(Appointment app, String key, String adharNo,int vaccinationCentercode)
			throws MemberException, AppointmentException, LoginException,VaccinationCenterException {
//		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
//		if(loggedInUser!=null) {
//		if(loggedInUser.getAdmin()==false) {
//			
//			
//			Member mm = memberRepo.findByAdharcardNo(adharNo);
//			if (mm == null) {
//				throw new MemberException("No member found with this aadhaar card number ");
//			}else {
//				VaccineRegistration vaccineRegistration = vaccineRegistrationRepo.findBymobileno(app.getMobileNo());
//				if(vaccineRegistration.getMember().contains(mm)) {
//					
//					
//					if(mm.isDose1status()) {
//						mm.setDose2status(app.isBookingstatus());
//					}else {
//						mm.setDose1date(app.getDatofbooking());
//						mm.setDose1status(app.isBookingstatus());
//						mm.setDose2date(app.getDatofbooking().plusMonths(3));
//					}
//					memberRepo.save(mm);
//					app.setMember(mm);
//					Optional<VaccinationCenter> vc = vaccinationCenterRepo.findById(vaccinationCentercode);
//					if(vc.isPresent()) {
//						app.setVaccinationcenter(vc.get());
//						vc.get().getAppointments().add(app);
//						appointmentRepo.save(app);
//						return app;
//					}else {
//						throw new VaccinationCenterException("No vaccination center found with this vaccination center code ");
//					}
//				}else {
//					throw new MemberException("Invalid mobile number ");	
//				}
//			}
//		}else{
//			throw new LoginException("Person logged in is a admin not member ");
//		}
//		}else {
//			throw new LoginException("To book appointment login first ");
//		} 
			return null;
	}

	@Override
	public Appointment updateAppointment(Appointment app, String key, String adharNo,int vaccinationCentercode)
			throws MemberException, AppointmentException, LoginException,VaccinationCenterException  {
//		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
//		if(loggedInUser!=null) {
//		if(loggedInUser.getAdmin()==false) {
//			
//			
//			Member mm = memberRepo.findByAdharcardNo(adharNo);
//			if (mm == null) {
//				throw new MemberException("No member found with this aadhaar card number ");
//			}else {
//				VaccineRegistration vaccineRegistration = vaccineRegistrationRepo.findBymobileno(app.getMobileNo());
//				if(vaccineRegistration.getMember().contains(mm)) {
//					
//					
//					if(mm.isDose1status()) {
//						mm.setDose2status(app.isBookingstatus());
//					}else {
//						mm.setDose1date(app.getDatofbooking());
//						mm.setDose1status(app.isBookingstatus());
//						mm.setDose2date(app.getDatofbooking().plusMonths(3));
//					}
//					memberRepo.save(mm);
//					app.setMember(mm);
//					Optional<VaccinationCenter> vc = vaccinationCenterRepo.findById(vaccinationCentercode);
//					if(vc.isPresent()) {
//						app.setVaccinationcenter(vc.get());
//						vc.get().getAppointments().add(app);
//						appointmentRepo.save(app);
//						return app;
//					}else {
//						throw new VaccinationCenterException("No vaccination center found with this vaccination center code ");
//					}
//				}else {
//					throw new MemberException("Invalid mobile number ");	
//				}
//			}
//		}else{
//			throw new LoginException("Person logged in is a admin not member ");
//		}
//		}else {
//			throw new LoginException("To book appointment login first ");
//		} 
		return null;
	}

	@Override
	public Appointment deleteAppointment(Appointment app, String key, String adharNo,int vaccinationCentercode)
			throws MemberException, AppointmentException, LoginException,VaccinationCenterException  {
//		CurrentUserSession loggedInUser = currentUserSessionRepo.findByUuid(key);
//		if(loggedInUser!=null) {
//		if(loggedInUser.getAdmin()==false) {
//			
//			
//			Member mm = memberRepo.findByAdharcardNo(adharNo);
//			if (mm == null) {
//				throw new MemberException("No member found with this aadhaar card number ");
//			}else {
//				VaccineRegistration vaccineRegistration = vaccineRegistrationRepo.findBymobileno(app.getMobileNo());
//				if(vaccineRegistration.getMember().contains(mm)) {
//					
//					
//					if(mm.isDose1status()) {
//						mm.setDose2status(false);
//					}else {
//						mm.setDose1date(null);
//						mm.setDose1status(false);
//						mm.setDose2date(null);
//					}
//					mm.setAppointment(null);
//					memberRepo.save(mm);
//					app.setMember(mm);
//					Optional<VaccinationCenter> vc = vaccinationCenterRepo.findById(vaccinationCentercode);
//					if(vc.isPresent()) {
//						app.setVaccinationcenter(vc.get());
//						vc.get().getAppointments().remove(app);
//						appointmentRepo.delete(app);
//						return app;
//					}else {
//						throw new VaccinationCenterException("No vaccination center found with this vaccination center code ");
//					}
//				}else {
//					throw new MemberException("Invalid mobile number ");	
//				}
//			}
//		}else{
//			throw new LoginException("Person logged in is a admin not member ");
//		}
//		}else {
//			throw new LoginException("To book appointment login first ");
//		} 
		return null;
		
	}

	@Override
	public Appointment getAppointment(int bookingid) throws AppointmentException {
		Optional<Appointment> ap = appointmentRepo.findById(bookingid);
		if(ap.isPresent()) {
			Appointment appointment = ap.get();
			return appointment;
		}else {
			throw new AppointmentException("No appointment found with this booking ID ");
		}
	}
   
}