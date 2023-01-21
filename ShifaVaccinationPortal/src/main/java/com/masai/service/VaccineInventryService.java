package com.masai.service;
import java.time.LocalDate;
import java.util.List;

import com.masai.exception.VaccineInventryException;
import com.masai.model.*;

public interface VaccineInventryService {
	public List<VaccineInventory> allVaccineInventry() throws VaccineInventryException;
	public VaccineInventory getVaccineInventryByCentre(Integer centreId) throws VaccineInventryException;
	public VaccineInventory addVaccineCount(VaccineInventory vaccineInventory) throws VaccineInventryException;
	public VaccineInventory updateVaccineInventry(VaccineInventory inventory) throws VaccineInventryException;
	public VaccineInventory deleteVaccineInventry(VaccineInventory vaccineInventory) throws VaccineInventryException;
	public List<VaccineInventory> getVaccineInventryByDate(LocalDate date) throws VaccineInventryException;
	public List<VaccineInventory> getVaccineInventryByVaccine(Vaccine vaccine) throws VaccineInventryException;

}
