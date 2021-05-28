package model.service.Impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.service.IProductService;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findByAll() {
        return productRepository.findByAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public void editProduct(String id, Product product) {
        productRepository.editProduct(id, product);
    }

    @Override
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public void removeProduct(String id) {
        productRepository.removeProduct(id);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }
}
