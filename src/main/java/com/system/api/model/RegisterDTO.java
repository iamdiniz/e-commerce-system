package com.system.api.model;

import java.math.BigDecimal;

import com.system.domain.enums.UserRole;

public record RegisterDTO(String name, String email, String password, BigDecimal balance, UserRole role) {

}
