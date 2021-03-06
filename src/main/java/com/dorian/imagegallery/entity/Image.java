package com.dorian.imagegallery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String imageUrl;
	
	private String imageId;
	
	public Image() {
		
	}

	public Image(String name, String imageUrl, String imageId) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.imageId = imageId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", imageId=" + imageId + "]";
	}
	
}
