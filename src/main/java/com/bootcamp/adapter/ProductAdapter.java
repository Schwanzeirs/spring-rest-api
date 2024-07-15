package com.bootcamp.adapter;

import org.springframework.stereotype.Component;

import com.bootcamp.entities.Product;
import com.bootcamp.repository.ProductRepository;

@Component
public class ProductAdapter {
    
    private final ProductRepository productRepository;

    public ProductAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product insert(Product product) {
        return productRepository.save(product);
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public Product findById(long id) {
        return productRepository.findById(id).get();
    }
}
