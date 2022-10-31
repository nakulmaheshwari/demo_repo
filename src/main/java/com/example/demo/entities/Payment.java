package com.example.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	

	private int total;

	@OneToOne(cascade = CascadeType.ALL)
	//@JsonManagedReference
	private Orders order;

}
