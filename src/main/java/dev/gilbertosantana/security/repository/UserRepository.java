package dev.gilbertosantana.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import dev.gilbertosantana.security.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	Optional<UserDetails> findUserByEmail(String username);
}
