package com.bootcamp.service;

import org.springframework.stereotype.Service;

import com.bootcamp.adapter.ProductAdapter;
import com.bootcamp.dto.ProductRequest;
import com.bootcamp.entities.Product;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    
    private final ProductAdapter productAdapter;

    public ProductServiceImpl(ProductAdapter productAdapter) {
        this.productAdapter = productAdapter;
    }

    @Override
    public Product insertProduct(ProductRequest request) {
        try {
            return productAdapter.insert(new Product(request));
        } catch (Exception exception) {
            throw exception;
        }
    }

    @Override
    public Product findById(long id) {
        try {
            return productAdapter.findById(id);
        } catch (Exception exception) {
            throw exception;
        }
    }

    @Override
    public Product updateProduct(long id,ProductRequest request) {
        try {
            Product product = productAdapter.findById(id);

            return productAdapter.update(setNewProduct(product, request));
        } catch (Exception exception) {
            throw exception;
        }
    }

    private Product setNewProduct(Product product, ProductRequest request) {
        if(request.getProductName() != null) {
            product.setProductName(request.getProductName());
        }
        if(request.getType() != null) {
            product.setType(request.getType());
        }
        if(request.getPrice() > 0) {
            product.setPrice(request.getPrice());
        }

        return product;
    }
}
