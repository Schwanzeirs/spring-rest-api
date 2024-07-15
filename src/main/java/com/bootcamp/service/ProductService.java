package com.bootcamp.service;

import org.springframework.stereotype.Service;

import com.bootcamp.dto.ProductRequest;
import com.bootcamp.entities.Product;

import jakarta.transaction.Transactional;

@Service
@Transactional
public interface ProductService {
    Product insertProduct(ProductRequest request);
    Product findById(long id);
    Product updateProduct(long id, ProductRequest request);
}
