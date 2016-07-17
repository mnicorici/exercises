package com.endava.internship.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endava.internship.rest.model.Apartment;
import com.endava.internship.rest.model.Building;
import com.endava.internship.rest.repository.ApartmentRepository;
import com.endava.internship.rest.repository.BuildingRepository;

@Service
public class ApartmentService 
{
	@Autowired
	private BuildingRepository buildingRepository;
	
	@Autowired
	private ApartmentRepository apartmentRepository;
	
	public List<Apartment> getAll(Integer buildingId)
	{
		Building building = buildingRepository.getById(buildingId);
		
		List<Apartment> apartmentList = apartmentRepository.getAll(building);
		
		return apartmentList;
	}
	
	public Apartment getById(Integer buildid, Integer apartId)
	{
		return apartmentRepository.getById(buildid, getAll(buildid), apartId);
	}
	
	
}
