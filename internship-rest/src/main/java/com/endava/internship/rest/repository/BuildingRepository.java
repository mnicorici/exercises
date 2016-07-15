package com.endava.internship.rest.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.endava.internship.rest.model.Building;

@Repository
public class BuildingRepository 
{
	private List<Building> buildingList;
	
	
	@PostConstruct
	public void initialize(){
		buildingList = new ArrayList<>();
		
		Building building = new Building(1, "Building 1", "Street 1");
		Building secBuilding = new Building(2, "Building 2", "Street 2");
		
		buildingList.add(building);
		buildingList.add(secBuilding);
	}
	
	
	public Building createBuilding(Building building)
	{
		Building buildingNew = new Building(5, building.getName(), building.getAdress());
		this.buildingList.add(buildingNew);
		return building;
	}
	
	public List<Building> createBuildings(List<Building> building)
	{
		List<Building> buildingNew = new ArrayList<>();
		this.buildingList.removeAll(buildingList);
		for(Building build: building)
		{
			buildingList.add(this.createBuilding(build));
		}
		System.out.print(buildingList);
		return buildingList;
	}
	
	public Building getById(Integer id)
	{
		Building bild = null;
		for(Building building: buildingList)
		{
			if(building.getId() == id)
				 bild = building;
		}
		return bild;
	}
	
	public List<Building> getAll()
	{
		return this.buildingList;
	}
	
	public void deleteById(Integer id)
	{
		Building build = this.getById(id);
		this.buildingList.remove(build);
	}
	
	public void deleteAll()
	{
		this.buildingList.clear();
	}
	
	
	
}
