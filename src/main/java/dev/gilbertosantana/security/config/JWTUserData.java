package dev.gilbertosantana.security.config;

import dev.gilbertosantana.security.entity.Role;
import lombok.Builder;

import java.util.List;

@Builder
public record JWTUserData(Long userId, String email, List<String> roles) {

}
