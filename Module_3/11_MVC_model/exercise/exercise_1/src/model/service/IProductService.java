package model.service;

import model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void create(String id,Product product);
    void update(String id,Product product);
    void remove(String id);
    Product findById(String id);
    Product findByName(String name);
}
