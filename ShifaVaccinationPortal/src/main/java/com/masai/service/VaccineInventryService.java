package com.masai.service;
import java.time.LocalDate;
import java.util.List;

import com.masai.exception.VaccineInventoryException;
import com.masai.model.Vaccine;
import com.masai.model.VaccineInventory;

public interface VaccineInventryService {
	public List<VaccineInventory> allVaccineInventry() throws VaccineInventoryException;
	public VaccineInventory getVaccineInventryByCentre(Integer centreId) throws VaccineInventoryException;
	public VaccineInventory addVaccineCount(VaccineInventory vaccineInventory) throws VaccineInventoryException;
	public VaccineInventory updateVaccineInventry(VaccineInventory inventory) throws VaccineInventoryException;
	public VaccineInventory deleteVaccineInventry(VaccineInventory vaccineInventory) throws VaccineInventoryException;
	public List<VaccineInventory> getVaccineInventryByDate(LocalDate date) throws VaccineInventoryException;
	public List<VaccineInventory> getVaccineInventryByVaccine(Vaccine vaccine) throws VaccineInventoryException;

}
