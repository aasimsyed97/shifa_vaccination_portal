package com.masai.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.VaccineInventory;

@Repository
public interface VaccineInventryRepo extends JpaRepository<VaccineInventory, LocalDate> {
   List<VaccineInventory> findByDate(LocalDate date);
}