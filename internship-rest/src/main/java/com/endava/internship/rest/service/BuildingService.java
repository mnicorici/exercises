package com.endava.internship.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endava.internship.rest.exception.ValidationException;
import com.endava.internship.rest.model.Building;
import com.endava.internship.rest.repository.BuildingRepository;

@Service
public class BuildingService 
{
	@Autowired
	private BuildingRepository buildingRepository;
	
	
	public List<Building> getAll()
	{
		List<Building> buildingList = buildingRepository.getAll();
		
		return buildingList;
	}
	
	public Building getById(Integer id)
	{
		return buildingRepository.getById(id);
	}
	
	public void deleteById(Integer id)
	{
		buildingRepository.deleteById(id);	
	}
	
	public void deleteAll()
	{
		buildingRepository.deleteAll();
	}
	
	public Building createBuilding(Building building)
	{
		if(building.getAdress().isEmpty() || building.getName().isEmpty())
		{
			throw new ValidationException("building is empty!!");
		}
		Building build = this.buildingRepository.createBuilding(building);
		return build;
	}
	
	public List<Building> createBuildings(List<Building> list)
	{
		List<Building> building = this.buildingRepository.createBuildings(list);
		return building;
	}
}
