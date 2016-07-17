package com.endava.internship.rest.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.endava.internship.rest.model.Apartment;
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
		
		Apartment apart1 = new Apartment(1,1,1,"apartment1");
		Apartment apart2 = new Apartment(2,2,2,"apartment2");
		
		List<Apartment> apartList = new ArrayList<>();
		apartList.add(apart2);
		apartList.add(apart1);
		
		building.setListApartment(apartList);
		//secBuilding.setListApartment(apartList);
		
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
		List<Building> buildingsNew = new ArrayList<>();
		this.buildingList.removeAll(buildingList);
		for(Building build: building)
		{
			Building buildingNew = new Building(5, build.getName(), build.getAdress());
			buildingsNew.add(buildingNew);
		}
		buildingList.addAll(buildingsNew);
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
