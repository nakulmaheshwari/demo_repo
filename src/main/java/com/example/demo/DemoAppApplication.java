package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		
		//ApplicationContext c =  
				SpringApplication.run(DemoAppApplication.class, args);
		
		//ProductRepository ur =  c.getBean(ProductRepository.class);
		//Product u = new Product(1,"dfg",7);
		//Product user = ur.save(u);
		
		//System.out.println(user);
				

				//@Autowired
			//	OrdersRepository rs
				
	}

}
