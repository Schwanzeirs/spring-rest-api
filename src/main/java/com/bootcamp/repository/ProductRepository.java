package com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
