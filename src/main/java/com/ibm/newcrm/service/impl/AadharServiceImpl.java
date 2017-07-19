package com.ibm.newcrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.newcrm.entity.AadharEntity;
import com.ibm.newcrm.repository.AadharRepository;
import com.ibm.newcrm.service.AadharService;

@Service
public class AadharServiceImpl implements AadharService
{

	@Autowired
	private AadharRepository aadharRepository;
	
	@Override
	public void saveAadharDetails(AadharEntity aadharEntity) 
	{
		aadharRepository.save(aadharEntity);
	}
	
}
