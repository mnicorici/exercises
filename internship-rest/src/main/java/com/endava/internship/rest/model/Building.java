package com.endava.internship.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Building 
{
	private List<Apartment> listApartment = new ArrayList<>();
	
	private Integer id;
	private String name;
	private String adress;
	
	public Building(){}
	
	public Building(Integer id, String name, String adress)
	{
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	
	public List<Apartment> getListApartment() {
		return listApartment;
	}
	public void setListApartment(List<Apartment> listApartment) {
		this.listApartment = listApartment;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
	
	
	
}
