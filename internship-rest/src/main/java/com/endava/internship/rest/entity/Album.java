package com.endava.internship.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album 
{
	@Id
	@Column(name = "album_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer albumId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "releasedate")
	private Date releaseDate;
	
	@Column(name = "likes")
	private Integer likes;
	
	@ManyToOne
	@JoinColumn(name = "artist_id")
	private Artist artist;
	
	public Album(){}
	
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	
}
