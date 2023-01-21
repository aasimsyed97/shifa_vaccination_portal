package com.masai.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class VaccineInventory {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int vaccineInventoryId;
   
	private LocalDate date; 
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<VaccineCount> vaccineCount;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private VaccinationCenter VaccinationCenter;


	public VaccineInventory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VaccineInventory(int vaccineInventoryId, LocalDate date, List<VaccineCount> vaccineCount,
			com.masai.model.VaccinationCenter vaccinationCenter) {
		super();
		this.vaccineInventoryId = vaccineInventoryId;
		this.date = date;
		this.vaccineCount = vaccineCount;
		VaccinationCenter = vaccinationCenter;
	}


	public int getVaccineInventoryId() {
		return vaccineInventoryId;
	}


	public void setVaccineInventoryId(int vaccineInventoryId) {
		this.vaccineInventoryId = vaccineInventoryId;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public List<VaccineCount> getVaccineCount() {
		return vaccineCount;
	}


	public void setVaccineCount(List<VaccineCount> vaccineCount) {
		this.vaccineCount = vaccineCount;
	}


	public VaccinationCenter getVaccinationCenter() {
		return VaccinationCenter;
	}


	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		VaccinationCenter = vaccinationCenter;
	}


	@Override
	public String toString() {
		return "VaccineInventory [vaccineInventoryId=" + vaccineInventoryId + ", date=" + date + ", vaccineCount="
				+ vaccineCount + ", VaccinationCenter=" + VaccinationCenter + "]";
	}

	
	
	
}
