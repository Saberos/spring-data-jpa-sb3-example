package com.example.demo.repository;

import com.example.demo.entities.EntityT;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryT extends JpaRepository<EntityT, Long> {
}
