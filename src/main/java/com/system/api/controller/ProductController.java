package com.system.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.api.model.ProductRequestDTO;
import com.system.domain.model.Product;
import com.system.domain.repository.ProductRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity postProduct(@RequestBody @Valid ProductRequestDTO body){
	    Product newProduct = new Product(body);

	    this.productRepository.save(newProduct);
	    return ResponseEntity.ok().build();
	}
	
}
