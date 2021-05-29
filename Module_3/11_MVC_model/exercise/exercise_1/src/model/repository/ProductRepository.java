package model.repository;

import model.bean.Product;

import java.util.*;

public class ProductRepository {
    private static Map<String, Product> products = new HashMap<>();

    static {

        products.put("1", new Product("1", "VinaMilk Chocolate", "20000", "Chocolate", "VinaMilk"));
        products.put("2", new Product("2", "VinaMilk Vanilla", "20000", "Vanilla", "VinaMilk"));
        products.put("3", new Product("3", "Tiger Beer", "28000", "Beer 4.5%", "Tiger"));
        products.put("4", new Product("4", "Heineken Beer", "30000", "Beer 4.8%", "Heineken"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }


    public void create(String id, Product product) {
        products.put(id, product);
    }

    public void update(String id, Product product) {
        products.put(id, product);
    }


    public void remove(String id) {
        products.remove(id);
    }


    public Product findById(String id) {
        return products.get(id);
    }

    public Product findByName(String name) {
        Product product;
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            product = entry.getValue();
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}



