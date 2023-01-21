package com.masai.model;

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
	 
          private String vaccninName;
        
        
     	  private String description;
     	
     	@OneToOne(cascade = CascadeType.ALL)
     	private VaccineCount vaccineCount;

		public Vaccine() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Vaccine(Integer vaccineId, String vaccninName, String description, VaccineCount vaccineCount) {
			super();
			this.vaccineId = vaccineId;
			this.vaccninName = vaccninName;
			this.description = description;
			this.vaccineCount = vaccineCount;
		}

		public Integer getVaccineId() {
			return vaccineId;
		}

		public void setVaccineId(Integer vaccineId) {
			this.vaccineId = vaccineId;
		}

		public String getVaccninName() {
			return vaccninName;
		}

		public void setVaccninName(String vaccninName) {
			this.vaccninName = vaccninName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public VaccineCount getVaccineCount() {
			return vaccineCount;
		}

		public void setVaccineCount(VaccineCount vaccineCount) {
			this.vaccineCount = vaccineCount;
		}

		@Override
		public String toString() {
			return "Vaccine [vaccineId=" + vaccineId + ", vaccninName=" + vaccninName + ", description=" + description
					+ ", vaccineCount=" + vaccineCount + "]";
		} 
     	
     	
	
}