package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;

public interface VaccineRepo extends JpaRepository<VaccineRepo, Integer>{
	public Optional<Vaccine> findByVaccineName(String Name) throws VaccineException;
}
