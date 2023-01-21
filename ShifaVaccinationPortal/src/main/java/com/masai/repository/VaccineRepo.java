package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.exception.VaccineException;
import com.masai.model.Vaccine;

@Repository
public interface VaccineRepo extends JpaRepository<Vaccine, Integer>{
	  public Vaccine findByVaccninName(String vaccineName);
}