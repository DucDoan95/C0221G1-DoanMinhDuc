package com.example.shopping_cart.model.service;

import com.example.shopping_cart.model.entity.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
