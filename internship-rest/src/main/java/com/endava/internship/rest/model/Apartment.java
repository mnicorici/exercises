package com.endava.internship.rest.model;

public class Apartment 
{
	private Integer id;
	private Integer number;
	private Integer floor;
	private String name;
	
	
	public Apartment(Integer number, Integer floor, Integer id, String name)
	{
		this.id = id;
		this.number = number;
		this.floor = floor;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	
}
