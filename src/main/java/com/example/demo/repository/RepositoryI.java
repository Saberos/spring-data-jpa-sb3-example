package com.example.demo.repository;

import com.example.demo.entities.EntityI;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryI extends JpaRepository<EntityI, Long> {
}
