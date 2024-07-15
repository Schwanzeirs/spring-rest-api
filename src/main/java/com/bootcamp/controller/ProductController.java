package com.bootcamp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.dto.ProductRequest;
import com.bootcamp.entities.Product;
import com.bootcamp.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/insert")
    public Product insert(@RequestBody ProductRequest request) {
        return productService.insertProduct(request);
    }

    @GetMapping("/find/{id}")
    public Product findById(@PathVariable final long id) {
        return productService.findById(id);
    }

    @PatchMapping("/update/{id}")
    public Product updateProduct(@PathVariable final long id, @RequestBody ProductRequest request) {
        return productService.updateProduct(id, request);
    }
}
