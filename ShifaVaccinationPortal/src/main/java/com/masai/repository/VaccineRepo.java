package com.masai.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;

public interface VaccineRepo extends JpaRepository<VaccineRepo, Integer>{
	public Optional<Vaccine> findByVaccineName(String Name) throws VaccineException;

	public Vaccine save(Vaccine vaccine);

	public static int getIdByName(String name) {
// TODO Auto-generated method stub
return 0;
	}
}
