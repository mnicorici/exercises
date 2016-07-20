package com.endava.internship.rest.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endava.internship.rest.entity.Artist;
import com.endava.internship.rest.repository.ArtistDAO;

@Service
public class ArtistService 
{

	@Autowired
	ArtistDAO artistDAO;
	
	public ArrayList<Artist> getArtists() {
		return (ArrayList<Artist>) artistDAO.getAllArtist();
	}
}
