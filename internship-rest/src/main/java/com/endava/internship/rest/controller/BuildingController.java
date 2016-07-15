package com.endava.internship.rest.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

import com.endava.internship.rest.model.Building;
import com.endava.internship.rest.model.HelloMessage;
import com.endava.internship.rest.service.BuildingService;

@RestController
@RequestMapping(path = "/buildings", produces = MediaType.APPLICATION_JSON_VALUE)
public class BuildingController 
{
	@Autowired
	private BuildingService buildingService;
	
	@RequestMapping(method = RequestMethod.GET)
	public HttpEntity<Resources<Resource<Building>>> getBuildings()
	{
		List<Building> buildings = this.buildingService.getAll();
		
		Resources<Resource<Building>> buildingResources = Resources.wrap(buildings);
		
		buildingResources.add(linkTo(methodOn(BuildingController.class).getBuildings()).withSelfRel());
		
		buildingResources.forEach((buildingResource -> {
			buildingResource.add(linkTo(methodOn(BuildingController.class)
                    .getBuilding(buildingResource.getContent().getId())).withSelfRel());
        }));
		
		return new ResponseEntity<>(buildingResources, HttpStatus.OK);
				
 	}
	
	@RequestMapping(value = "/{buildingId}", method = RequestMethod.GET)
	public HttpEntity<Resource<Building>> getBuilding(@PathVariable Integer buildingId)
	{
		Building building = this.buildingService.getById(buildingId);
		
		Resource<Building> buildingResource = new Resource<>(building);
		buildingResource.add(linkTo(methodOn(BuildingController.class).getBuilding(buildingId)).withSelfRel());
		
		return new ResponseEntity<>(buildingResource, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{buildingId}", method = RequestMethod.DELETE)
	public HttpEntity<Resource<Building>> deleteBuilding(@PathVariable Integer buildingId)
	{
		this.buildingService.deleteById(buildingId);	
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public HttpEntity<Resources<Resource<Building>>> deleteBuildings()
	{
		this.buildingService.deleteAll();
		
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
 	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Resource<Building>> createBuilding(@RequestBody Building building) {
        Building createdBuilding = this.buildingService.createBuilding(building);

        Resource<Building> buildingResource = new Resource<>(createdBuilding);
        //buildingResource.add(linkTo(methodOn(BuildingController.class).getBuilding(buildingResource.getContent().getId())).withSelfRel());

        return new ResponseEntity<>(buildingResource, HttpStatus.CREATED);
    }
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<Resource<Building>> createBuildings(@RequestBody List<Building> buildings) {
        List<Building> createdBuildings = this.buildingService.createBuildings(buildings);

        //Resource<List<Building>> buildingResource = new Resource<>(createdBuildings);
        //buildingResource.add(linkTo(methodOn(BuildingController.class).getBuilding(buildingResource.getContent().getId())).withSelfRel());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
	
	
}
