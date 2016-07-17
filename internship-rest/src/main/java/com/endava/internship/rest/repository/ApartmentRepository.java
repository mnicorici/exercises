package com.endava.internship.rest.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.endava.internship.rest.model.Apartment;
import com.endava.internship.rest.model.Building;

@Repository
public class ApartmentRepository 
{
	private List<Apartment> listApartment;
	
	public List<Apartment> getAll(Building building)
	{	
		return building.getListApartment();
	}
	
	public Apartment getById(Integer id, List<Apartment> list, Integer apartId)
	{
		Apartment apartment = null;
		for(Apartment apart: list)
		{
			if(apart.getId() == apartId)
				 apartment = apart;
		}
		return apartment;
	}
}
