package com.endava.internship.rest.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist 
{
	@Id
	@Column(name = "artist_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer artistId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "origin")
	private String origin;
	
	@Column(name = "launchdate")
	private Date launchDate;
	
	@ManyToMany
	@JoinTable(name = "ArtistGender", joinColumns = @JoinColumn(name = "artist_id"), inverseJoinColumns = @JoinColumn(name = "gender_id"))
	private Set<Gender> genders = new HashSet<>();
	
	public Artist(){}
	
	public Integer getArtistId() {
		return artistId;
	}
	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Date getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	
	

}
