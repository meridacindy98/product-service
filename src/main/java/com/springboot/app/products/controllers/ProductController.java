package com.springboot.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.products.models.entity.Product;
import com.springboot.app.products.models.service.ProductoService;

@RestController
public class ProductController {

	@Autowired
	private ProductoService productService;
	
	@GetMapping("/products")
	public List<Product> listAllProducts(){
		return productService.findAll();
	}
	
	@GetMapping("/product/{productId}")
	public Product getProduct( @PathVariable Long productId ) {
		return productService.findById(productId);
	}  
	
	
	
}
