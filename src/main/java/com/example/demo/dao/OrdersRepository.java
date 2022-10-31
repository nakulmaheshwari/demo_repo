package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;

public interface OrdersRepository extends CrudRepository<Orders, Integer>{
	public Orders findById(int id);
}
