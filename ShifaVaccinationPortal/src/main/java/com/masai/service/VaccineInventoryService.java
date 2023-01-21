package com.masai.service;
import java.time.LocalDate;
import java.util.List;

import com.masai.exception.VaccineInventoryException;
import com.masai.model.Vaccine;
import com.masai.model.VaccineInventory;

public interface VaccineInventoryService {
	public List<VaccineInventory> allVaccineInventory() throws VaccineInventoryException;
	public VaccineInventory getVaccineInventoryByCentre(Integer centreId) throws VaccineInventoryException;
	public VaccineInventory addVaccineCount(VaccineInventory vaccineInventory) throws VaccineInventoryException;
	public VaccineInventory updateVaccineInventory(VaccineInventory inventory) throws VaccineInventoryException;
	public VaccineInventory deleteVaccineInventory(VaccineInventory vaccineInventory) throws VaccineInventoryException;
	public List<VaccineInventory> getVaccineInventoryByDate(LocalDate Date) throws VaccineInventoryException;
	public List<VaccineInventory> getVaccineInventoryByVaccine(Vaccine vaccine) throws VaccineInventoryException;

}
