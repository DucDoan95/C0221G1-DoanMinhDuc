package bai_tap;


import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class InputStreamProduct {
    public static void main(String[] args) {
        List<Product>products = new ArrayList<>();
        Product product = new Product();

        product.setProductName("Samsung Galaxy xxx");
        product.setProductID("001");
        product.setProductCompany("Samsung");
        product.setProductPrice(1000000);
        product.setDescription("ahihi");
        products.add(product);
        try {
            OutputStream os = new FileOutputStream("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS17 -  IO Binary File and Serialization\\src\\bai_tap\\product.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(products);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
