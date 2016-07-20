package com.endava.internship.rest.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "gender")
public class Gender 
{
	@Id
	@Column(name = "gender_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer genderId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "artistorigin")
	private String artistOrigin;
	
	@Column(name = "firstappearedin")
	private Date firstAppearedIn;
	
	@ManyToMany
	@JoinTable(name = "ArtistGender", joinColumns = @JoinColumn(name = "gender_id"), inverseJoinColumns = @JoinColumn(name = "artist_id"))
	private Set<Artist> artists = new HashSet<>();
	
	public Gender(){}
	
	public Integer getGenderId() {
		return genderId;
	}
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getArtistOrigin() {
		return artistOrigin;
	}
	public void setArtistOrigin(String artistOrigin) {
		this.artistOrigin = artistOrigin;
	}
	public Date getFirstAppearedIn() {
		return firstAppearedIn;
	}
	public void setFirstAppearedIn(Date firstAppearedIn) {
		this.firstAppearedIn = firstAppearedIn;
	}

	
	
}
