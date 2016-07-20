package com.endava.internship.rest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.endava.internship.rest.entity.Artist;

@Repository
public class ArtistDAO extends AbstractDAO<Artist>
{
	protected ArtistDAO()
	{
		super(Artist.class);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Artist> getAllArtist() {
		return em()
				.createQuery(
						"SELECT q FROM Artist q")
				.getResultList();
	}
}
