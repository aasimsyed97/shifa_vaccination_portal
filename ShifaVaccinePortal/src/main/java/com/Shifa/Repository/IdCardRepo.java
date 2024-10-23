package com.Shifa.Repository;

import com.Shifa.Model.IdCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface IdCardRepo extends JpaRepository<IdCard, UUID> {


}
