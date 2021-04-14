package bai_tap.arraylist_linkedlist_in_java_collection_framwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager extends Product {
    ArrayList<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {


        System.out.println("Enter id Product: ");
        int id = (Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter name Product: ");
       String name = (scanner.nextLine());
        System.out.println("Enter price Product");
        Double price = (double)(Integer.parseInt(scanner.nextLine()));
        Product product = new Product(id,name,price);
        products.add(product);

    }

    public void editProduct() {
        System.out.println("Enter id product want to change: ");
        int edit =Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == edit) {
                System.out.println("Enter new id Product");
                products.get(i).setProductId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter new name Product");
                products.get(i).setProductName(scanner.nextLine());
                System.out.println("Enter new price Product");
                products.get(i).setProductPrice((Integer.parseInt(scanner.nextLine())));
            }

        }
    }
    public void deleteProduct(){
        System.out.println("Enter id product want to deleted: ");
        int xoa = scanner.nextInt();
        for(int i=0;i<products.size();i++){
            if (products.get(i).getProductId() == xoa) {
                products.remove(products.get(i));
            }
        }
    }
    public void displayProduct(){
        for (int i=0; i<products.size();i++){
            System.out.print(products.get(i));
        }
    }
}
