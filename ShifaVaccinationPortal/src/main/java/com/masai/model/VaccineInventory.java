package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class VaccineInventory {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private LocalDate date; 
	
	@ManyToOne
	private  VaccineCount vaccinecount;
	
	
	@OneToOne 
	private VaccinationCenter vaccinationcenter;


	public VaccineInventory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public VaccineInventory(LocalDate date, VaccineCount vaccinecount, VaccinationCenter vaccinationcenter) {
		super();
		this.date = date;
		this.vaccinecount = vaccinecount;
		this.vaccinationcenter = vaccinationcenter;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public VaccineCount getVaccinecount() {
		return vaccinecount;
	}


	public void setVaccinecount(VaccineCount vaccinecount) {
		this.vaccinecount = vaccinecount;
	}


	public VaccinationCenter getVaccinationcenter() {
		return vaccinationcenter;
	}


	public void setVaccinationcenter(VaccinationCenter vaccinationcenter) {
		this.vaccinationcenter = vaccinationcenter;
	}


	@Override
	public String toString() {
		return "VaccineInventory [date=" + date + ", vaccinecount=" + vaccinecount + ", vaccinationcenter="
				+ vaccinationcenter + "]";
	} 
	
	
	
}
