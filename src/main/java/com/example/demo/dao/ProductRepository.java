package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Product;
@Component
public interface ProductRepository extends CrudRepository<Product, Integer>{
public Product findById(int id);
}
