package bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OutputStreamProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Codegym\\C0221G1-DoanMinhDuc\\Module_2\\SS17 -  IO Binary File and Serialization\\src\\bai_tap\\product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();

            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(products);
    }
}
