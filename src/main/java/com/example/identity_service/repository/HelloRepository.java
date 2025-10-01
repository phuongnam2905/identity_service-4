package com.example.identity_service.repository;

import com.example.identity_service.entities.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository extends JpaRepository<Hello, Long> {
}

