package com.masai.service;

import com.masai.exception.AppointmentException;
import com.masai.model.Appointment;

public interface AppointmentServices {
    public Appointment getAppointment(Integer bookingid) throws AppointmentException;

    public String addAppointment(Appointment app) throws AppointmentException;

    public String updateAppointment(Appointment app) throws AppointmentException;

    public String deleteAppointment(Appointment app) throws AppointmentException;

}