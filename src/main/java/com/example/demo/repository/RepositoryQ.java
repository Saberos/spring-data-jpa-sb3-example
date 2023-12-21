package com.example.demo.repository;

import com.example.demo.entities.EntityQ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryQ extends JpaRepository<EntityQ, Long> {
}
