package com.ecom.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.backend.model.Product;
import com.ecom.backend.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
 private ProductRepository productRepo;
	
	public Product createProduct(Product product) {
		Product save = productRepo.save(product);
		
		return save;
	}
	
}
