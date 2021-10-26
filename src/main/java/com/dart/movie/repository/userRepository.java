package com.dart.movie.repository;

import com.dart.movie.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
  boolean existsByEmail(String email);
}
