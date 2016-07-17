package com.endava.internship.rest.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.endava.internship.rest.model.Apartment;
import com.endava.internship.rest.model.Building;
import com.endava.internship.rest.service.ApartmentService;
import com.endava.internship.rest.service.BuildingService;

@RestController
@RequestMapping(path = "/buildings/{id}/apartments", produces = MediaType.APPLICATION_JSON_VALUE)
public class ApartmentController 
{
	@Autowired
	private BuildingService buildingService;
	
	@Autowired
	private ApartmentService apartmentService;
	
	@RequestMapping(method = RequestMethod.GET)
	public HttpEntity<Resources<Resource<Apartment>>> getApartments(@PathVariable Integer id)
	{
		List<Apartment> apartments = this.apartmentService.getAll(id);
		
		Resources<Resource<Apartment>> apartmentResources = Resources.wrap(apartments);
		
		apartmentResources.add(linkTo(methodOn(ApartmentController.class).getApartments(id)).withSelfRel());
		
		/*apartmentResources.forEach((buildingResource -> {
			buildingResource.add(linkTo(methodOn(BuildingController.class)
                    .getBuilding(buildingResource.getContent().getId())).withSelfRel());
        }));*/
		
		return new ResponseEntity<>(apartmentResources, HttpStatus.OK);
				
 	}
	
	@RequestMapping(value = "/{apartmentId}", method = RequestMethod.GET)
	public HttpEntity<Resource<Apartment>> getApartment(@PathVariable Integer apartmentId, @PathVariable Integer id)
	{
		Apartment apartment = this.apartmentService.getById(id,apartmentId);
		
		Resource<Apartment> apartmentResource = new Resource<>(apartment);
		apartmentResource.add(linkTo(methodOn(ApartmentController.class).getApartment(apartmentId, id)).withSelfRel());
		
		return new ResponseEntity<>(apartmentResource, HttpStatus.OK);
	}
}
