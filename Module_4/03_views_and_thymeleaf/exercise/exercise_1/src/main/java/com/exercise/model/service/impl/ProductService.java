package com.exercise.model.service.impl;

import com.exercise.model.bean.Product;
import com.exercise.model.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService {
    private static final Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1,"Milk",10000,"Chocolate","Vinammilk"));
        products.put(2, new Product(2,"Beer",20000,"4,5%","Tiger"));
        products.put(3, new Product(3,"Cake",15000,"Durian","MoonCake"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void create(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findByID(int id) {
        return products.get(id);
    }

    @Override
    public void edit(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>(products.values());
        List<Product> findList = new ArrayList<>();
        for (Product product: productList){
            if(product.getName().contains(name)){
                findList.add(product);
            }
        }
        return findList;
    }
}
