package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.masai.enums.Fingerprint;
import com.masai.enums.Iris;

@Entity
public class AdharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adharId;

	// @Pattern(regexp = "^[0-9]{12}", message = "{user.invalid.adharNo}")
	@Column(unique = true)
	private String adharNo;

//	@NotNull(message="FingerPrints can't be null")
	@Enumerated(EnumType.STRING)
	private Fingerprint fringerprints;

//	@NotNull(message="Iris can't be null")
	@Enumerated(EnumType.STRING)
	private Iris irisscan;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "adharCard")
	@JsonIgnore

	private IdCard idCard;

	public AdharCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdharCard(Integer adharId, String adharNo, Fingerprint fringerprints, Iris irisscan, IdCard idCard) {
		super();
		this.adharId = adharId;
		this.adharNo = adharNo;
		this.fringerprints = fringerprints;
		this.irisscan = irisscan;
		this.idCard = idCard;
	}

	public Integer getAdharId() {
		return adharId;
	}

	public void setAdharId(Integer adharId) {
		this.adharId = adharId;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public Fingerprint getFringerprints() {
		return fringerprints;
	}

	public void setFringerprints(Fingerprint fringerprints) {
		this.fringerprints = fringerprints;
	}

	public Iris getIrisscan() {
		return irisscan;
	}

	public void setIrisscan(Iris irisscan) {
		this.irisscan = irisscan;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "AdharCard [adharId=" + adharId + ", adharNo=" + adharNo + ", idCard=" + idCard + "]";
	}

}
