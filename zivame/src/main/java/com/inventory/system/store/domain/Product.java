package com.inventory.system.store.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "product")
public class Product {

	public Product(){
		
	}
	
	private Long id;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "product_type_id", nullable = false)
	private ProductType productType;

	@Temporal(TemporalType.DATE)
	private Date created;

	@Temporal(TemporalType.DATE)
	private Date modified;

	@Column(name = "name")
	private String name;

	@Column(name = "number_of_items")
	private int numberOfItems;

	public Product(ProductType productType, String name, int numberOfItems) {
		this.productType = productType;
		this.created = new Date();
		this.modified = new Date();
		this.name = name;
		this.numberOfItems = numberOfItems;
	}

}
