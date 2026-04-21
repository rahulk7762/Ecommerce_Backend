package com.ecom.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.backend.model.Product;
import com.ecom.backend.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productservice;
//	
//	Creating the Product :- http://localhost:8080/product/create
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		System.out.println("ProductController.createProduct()");
		Product createdProduct = productservice.createProduct(product)
;		return createdProduct;
	}
	
	
}
