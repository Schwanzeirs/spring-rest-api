package com.bootcamp.entities;

import com.bootcamp.dto.ProductRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;
    private String type;
    private double price;

    public Product(ProductRequest request) {
        this.productName = request.getProductName();
        this.type = request.getType();
        this.price = request.getPrice();
    }
}
