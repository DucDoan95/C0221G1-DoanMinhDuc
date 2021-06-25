package com.example.product_management.model.service;

import com.example.product_management.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);
    void create(Product product);
    Product findByID(Integer id);
    void delete(Integer id);
    Page<Product> findByName(String name, Pageable pageable);

}
