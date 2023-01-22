package com.masai.service;

import com.masai.model.IdCard;


public interface IdCardService {

	public IdCard getPanCardByNumber(String panNo);
	
	public IdCard getAdharCardByNo(long adharNo);
	
	public IdCard addIdCard (IdCard idCard);
}
