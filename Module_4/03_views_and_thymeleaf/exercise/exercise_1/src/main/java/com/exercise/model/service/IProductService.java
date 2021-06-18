package com.exercise.model.service;

import com.exercise.model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(Product product);
    Product findByID(int id);
    void edit(int id, Product product);
    void delete(int id);
    List<Product> findByName(String name);
}
