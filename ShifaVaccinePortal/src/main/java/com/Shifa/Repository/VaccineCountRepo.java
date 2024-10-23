package com.Shifa.Repository;

import com.Shifa.Model.VaccineCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineCountRepo extends JpaRepository<VaccineCount,Long> {
}
