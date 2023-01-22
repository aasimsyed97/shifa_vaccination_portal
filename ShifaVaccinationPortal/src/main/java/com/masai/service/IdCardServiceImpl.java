package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.IdCard;
import com.masai.repository.IdCardRepo;

@Service
public class IdCardServiceImpl implements IdCardService{

	@Autowired
	private IdCardRepo idRepo;
	
	
	
	@Override
	public IdCard getPanCardByNumber(String panNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdCard getAdharCardByNo(long adharNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdCard addIdCard(IdCard idCard) {
		
		IdCard id = idRepo.save(idCard);
		
		return id;
	}

}
