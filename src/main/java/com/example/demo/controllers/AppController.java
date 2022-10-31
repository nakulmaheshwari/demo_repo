package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.PaymentRepsoitory;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Payment;
import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;





@RestController
public class AppController {
	@Autowired
	private ProductService ps;
	@Autowired
	private PaymentRepsoitory pr;
	@PostMapping("/Payment")
	public Payment addProduct(@RequestBody Payment payment) {
		
		return pr.save(payment);
	}
	@Autowired
	private OrdersRepository or;
	@PostMapping("/Orders")
	public Orders addOrders(@RequestBody Orders orders) {
		
		return or.save(orders);
	}
	
	
	
	@GetMapping("/Orders")
	 public List<Orders> getOrders() {
		return (List<Orders>)or.findAll();
	}
	@GetMapping("/Payment")
	 public List<Payment> getPayment() {
		return (List<Payment>)pr.findAll();
	}
	
	
	@GetMapping("/Product")
	 public List<Product> getProduct() {
		return ps.getAllProducts();
	}
	@GetMapping("/Product/{id}")
	public Product getProduct(@PathVariable("id") int id) {
		return this.ps.getProductById(id);
	}
	@PostMapping("/Product")
	public Product addProduct(@RequestBody Product product) {
		Product b= this.ps.addProduct(product);
		return b;
	}
	
	@DeleteMapping("/Product/{ProductId}")
	public void deleteProduct(@PathVariable("ProductId") int ProductId) {
		this.ps.deleteProduct(ProductId); 
		
	}
	
	@PutMapping("/books/{ProductId}")
	public Product updateProduct(@RequestBody Product product ,@PathVariable("ProductId") int ProductId) {
		this.ps.updateProduct(product,ProductId); 
		return product;
	}
	
	@PutMapping("/Product/{ProductId}/Orders/{orderId}")
	public Product addProduct(@PathVariable("ProductId") int ProductId,@PathVariable("orderId") int orderId) {
		return ps.add(ProductId, orderId);
	}
	
	
}
