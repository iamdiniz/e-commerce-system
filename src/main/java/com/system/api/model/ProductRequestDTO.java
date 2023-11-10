package com.system.api.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(

		@NotBlank
		String name,
		
		@NotNull
		BigDecimal price
		
) {

}
