package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.model.Member;

@Repository
public interface MemberRepo extends JpaRepository<Member, Integer>{
	
////@Query("from Member where IdCard.Id=:idcardid")
//public Member findByidCard(@Param("idcardid") Integer idcardid);
//
////@Query("from Member where IdCard.adharCard.adharNo=:adarno")
//public Member findByAdharcardNo(@Param("adarno") String adarno);
//
////@Query("from Member where IdCard.panCard.panNo=:panno")
//public Member getFindByPanNo(@Param("panno") String panno);

}
