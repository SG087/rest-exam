package com.example.rest.project.rest_exam.security.repository;

import com.example.rest.project.rest_exam.security.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
