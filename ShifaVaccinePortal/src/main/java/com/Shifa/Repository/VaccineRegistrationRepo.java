package com.Shifa.Repository;

import com.Shifa.Model.VaccineRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRegistrationRepo extends JpaRepository<VaccineRegistration,Long> {
}
