package com.Shifa.Repository;

import com.Shifa.Model.VaccineInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineInventoryRepo extends JpaRepository<VaccineInventory,Long> {
}
