package com.example.demo.repository;

import com.example.demo.entities.EntityB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryB extends JpaRepository<EntityB, Long> {
}
