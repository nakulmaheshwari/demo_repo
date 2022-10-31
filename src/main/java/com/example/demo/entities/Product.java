package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerators;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor

@Entity
public class Product {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productid")
	private int ProductId;

	private String name;

	private int mrp;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id",referencedColumnName = "orderId" )
	private Orders order;



	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, int mrp) {
		super();
		ProductId = productId;
		this.name = name;
		this.mrp = mrp;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMrp() {
		return mrp;
	}

	public void setMrp(int mrp) {
		this.mrp = mrp;
	}


	public void addOrder(Orders order2) {
		this.order = order2;
		
	}  
	

	
	//@OneToOne(mappedBy = "product")
	//@JsonBackReference
	//private Payment pyment; 
	
	


	
	
	

}
