package com.example.demo.repository;

import com.example.demo.entities.EntityR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryR extends JpaRepository<EntityR, Long> {
}
