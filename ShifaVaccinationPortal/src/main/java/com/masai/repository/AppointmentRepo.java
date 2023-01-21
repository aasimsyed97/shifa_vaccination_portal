package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
