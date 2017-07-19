package com.ibm.newcrm.controller;

import com.ibm.newcrm.dto.AadharDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ibm.newcrm.entity.AadharEntity;
import com.ibm.newcrm.repository.AadharRepository;

@RestController
public class AadharController 
{
	@Autowired
	private AadharRepository aadharRepository;
	
	@RequestMapping(path="/aadhar", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody Iterable<AadharEntity> getAllAadharData()
	{
		return aadharRepository.findAll();
	}

	//@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(path="/aadhar", method=RequestMethod.POST)
	public void addAadhar(@RequestBody AadharDto aadharDto)
	{
		//aadharRepository.save(aadharEntity);
		System.err.println(aadharDto);
		AadharEntity entity = new AadharEntity();
		entity.setAadharNumber(aadharDto.getAadharText());
		entity.setFirstName(aadharDto.getFirstNameText());
		entity.setMiddleName(aadharDto.getMiddleNameText());
		entity.setLastName(aadharDto.getLastNameText());
		entity.setFatherSpouseName(aadharDto.getFatherNameText());
		entity.setOrganization(aadharDto.getOrganizationText());
		entity.setAddress1(aadharDto.getAddress1Text());
		entity.setAddress2(aadharDto.getAddress2Text());
		entity.setAddress3(aadharDto.getAddress3Text());
		entity.setLandmark(aadharDto.getLandmarkText());
		entity.setCity(aadharDto.getCityText());
		entity.setState(aadharDto.getStateText());
		entity.setMobileNumber(aadharDto.getMobileText());
		entity.setLandlineNumber(aadharDto.getLandlineText());
		entity.setEmail(aadharDto.getEmailText());

		aadharRepository.save(entity);
		System.err.println("Done...");
	}
}
