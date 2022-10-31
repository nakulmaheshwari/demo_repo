package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrdersRepository;
import com.example.demo.dao.ProductRepository;
import com.example.demo.entities.Orders;
import com.example.demo.entities.Product;


@Component
public class ProductService {
	@Autowired
	private ProductRepository pr;
	@Autowired
	private OrdersRepository or;
	
	public List<Product> getAllProducts()
	{ 
		return (List<Product >)this.pr.findAll();
	}  
	
	public Product getProductById(int id)
	{
		Product product = this.pr.findById(id);
		
		return product;
	}

	public Product addProduct(Product b)
	{
	
		return pr.save(b);
	}
	public void deleteProduct(int bid)
	{
		
	pr.deleteById(bid);    
		
	}
	public void updateProduct(Product p,int pid)
	{
		p.setProductId(pid);
		pr.save(p);
	}
	    
	public Product add(int pid,int oid)
	{
		Product product = pr.findById(pid);
		
		Orders order = or.findById(oid); 
		
		product.addOrder(order);
		
		return pr.save(product);
	}
}
 