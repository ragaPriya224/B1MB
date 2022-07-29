package com.practice.springbootsearchrestapidemo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Data
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sku;
	private String name;
	private String description;
	private boolean active;
	private String imageUrl;
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime dateUpdated;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	
	public Product() {
		
	}
	public Product(Long id, String sku, String name, String description, boolean active, String imageUrl,
			LocalDateTime dateCreated, LocalDateTime dateUpdated) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.active = active;
		this.imageUrl = imageUrl;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}
	
	

}
