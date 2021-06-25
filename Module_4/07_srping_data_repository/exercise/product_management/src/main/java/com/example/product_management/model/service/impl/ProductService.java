package com.example.product_management.model.service.impl;

import com.example.product_management.model.entity.Product;
import com.example.product_management.model.repository.IProductRepository;
import com.example.product_management.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository ;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iProductRepository.findAll(pageable);
    }

    @Override
    public void create(Product product) {
        iProductRepository.save(product);
    }


    @Override
    public void delete(Integer id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Product findByID(Integer id) {
        return iProductRepository.findById(id).orElse(null);
    }


    @Override
    public Page<Product> findByName(String name, Pageable pageable) {
        return iProductRepository.findAllByNameContaining(name,pageable);
    }
}
