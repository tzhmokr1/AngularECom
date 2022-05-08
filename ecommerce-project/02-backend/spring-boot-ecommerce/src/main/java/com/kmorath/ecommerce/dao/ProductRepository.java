package com.kmorath.ecommerce.dao;

import com.kmorath.ecommerce.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
