package com.example.WithoutView.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="mob")
public class Mobile {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="Company")
	private String company;
	
	@Column(name="Model")
	private String model;
	
	@Column(name="Price")
	private Long price;

	public Mobile(long id,String company, String model, Long price) {
		super();
		Id = id;
		this.company=company;
		this.model = model;
		this.price = price;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getPrice() {
		return price;
	}
	
	

	public void setPrice(Long price) {
		this.price = price;
	}
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
