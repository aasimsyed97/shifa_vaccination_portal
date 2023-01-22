package com.masai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Vaccine {
 
         @Id
         @GeneratedValue(strategy= GenerationType.AUTO)
	  private Integer vaccineId;
	  private String vaccineName;
	  private String description; 
	  
	  
	  @OneToOne(mappedBy= "vaccine", cascade= CascadeType.ALL)
	  private Member member;
	  
	  @OneToOne(mappedBy = "vaccine",cascade = CascadeType.ALL)
	  private VaccineCount vaccineCount;

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vaccine(Integer vaccineId, String vaccineName, String description, Member member,
			VaccineCount vaccineCount) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		this.description = description;
		this.member = member;
		this.vaccineCount = vaccineCount;
	}

	public Integer getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(Integer vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public VaccineCount getVaccineCount() {
		return vaccineCount;
	}

	public void setVaccineCount(VaccineCount vaccineCount) {
		this.vaccineCount = vaccineCount;
	}

	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", vaccineName=" + vaccineName + ", description=" + description
				+ ", member=" + member + ", vaccineCount=" + vaccineCount + "]";
	}

	public static List<Vaccine> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	  
	  
	  
	
}