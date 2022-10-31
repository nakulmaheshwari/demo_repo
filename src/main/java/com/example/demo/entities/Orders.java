package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Orders {

	
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	public Orders(int orderId, List<Product> product) {
		super();
		this.orderId = orderId;
		this.product = product;
	}

	@OneToMany(mappedBy = "order")
	private List<Product> product; 
	
	
	
	
}
