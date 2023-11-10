package com.system.api.model;

import java.math.BigDecimal;

import com.system.domain.model.Product;

public record ProductResponseDTO(Long id, String name, BigDecimal price) {
	
	public ProductResponseDTO(Product product) {
		this(product.getId(), product.getName(), product.getPrice());
	}

}
