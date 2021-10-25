package com.dart.movie.repository;

import com.dart.movie.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long>{
  boolean existsByEmail(String email);
}
