package com.Shifa.Repository;

import com.Shifa.Model.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationCenterRepo extends JpaRepository<VaccinationCenter,Integer> {
}
