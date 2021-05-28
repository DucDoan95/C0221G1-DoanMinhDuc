package model.reponsitory;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    static Map<String,Product> productMap = new HashMap<>();
    static {
        productMap.put("1",new Product("1","Milk VinaMilk",200000,"Chocolate","Vimamlik"));
        productMap.put("2",new Product("2","Milk TH True Milk",22000,"Vanilla","TH True Milk"));
        productMap.put("3",new Product("3","Beer Heineken",30000,"Beer","Heineken"));
        productMap.put("4",new Product("4","Beer Tiger",28000,"Beer","Tiger"));
    }
    public List<Product> findByAll() {
        return new ArrayList<>(productMap.values());
    }


    public Product findById(String id) {
        return productMap.get(id);
    }


    public void edit(String id, Product product) {
        productMap.
    }


    public void create(Product product) {

    }


    public void remove(String id) {

    }
}
