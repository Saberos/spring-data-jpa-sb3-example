package com.example.demo.repository;

import com.example.demo.entities.EntityC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryC extends JpaRepository<EntityC, Long> {
}
