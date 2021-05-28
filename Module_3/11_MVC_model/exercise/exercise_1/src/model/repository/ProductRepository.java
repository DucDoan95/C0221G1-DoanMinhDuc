package model.repository;

import model.bean.Product;

import java.util.*;

public class ProductRepository {
    static Map<String,Product> productMap;
    static {
        productMap.put("1",new Product("1","Vinamilk Chocolate",20000,"No Sugar","Vinamlik"));
        productMap.put("2",new Product("2","Vinamilk Vanila",20000,"Sugar","Vinamlik"));
        productMap.put("3",new Product("2","Beer Heniken",20000,"Beer 4,5% Alcohol","Heniken"));
        productMap.put("4",new Product("2","Beer Tiger",20000,"Beer 4,8 Alcohol","Tiger"));
    }
    public List<Product> findByAll() {
        return new ArrayList<>(productMap.values());
    }


    public Product findById(String id) {
        return productMap.get(id);
    }


    public void editProduct(String id, Product product) {
        productMap.put(id, product);
    }


    public void createProduct(Product product) {
        productMap.put(product.getId(),product);
    }


    public void removeProduct(String id) {
        productMap.remove(id);
    }


    public Product findByName(String name) {
        Set<String> set = productMap.keySet();
        for(String key: set){
            if(productMap.get(key).equals(name)){
                return productMap.get(key);
            }
        }
        return productMap.get(name);
    }
}
