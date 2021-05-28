package model.service;

import model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findByAll();

    Product findById(String id);

    void editProduct(String id, Product product);

    void createProduct(Product product);

    void removeProduct(String id);
    Product findByName(String name);
}
