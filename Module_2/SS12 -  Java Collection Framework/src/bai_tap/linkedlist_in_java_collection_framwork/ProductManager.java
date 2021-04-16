package bai_tap.linkedlist_in_java_collection_framwork;

import java.util.*;

public class ProductManager extends Product {
    List<Product> products = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Enter id Product: ");
        int id = (Integer.parseInt(scanner.nextLine()));
        System.out.print("Enter name Product: ");
        String name = (scanner.nextLine());
        System.out.print("Enter price Product: ");
        Double price = (double) (Integer.parseInt(scanner.nextLine()));
        Product product = new Product(id, name, price);
        products.add(product);

    }

    public void editProduct() {
        System.out.print("Enter id product want to change: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == id) {
                System.out.print("Enter new id Product: ");
                products.get(i).setProductId(Integer.parseInt(scanner.nextLine()));
                System.out.print("Enter new name Product: ");
                products.get(i).setProductName(scanner.nextLine());
                System.out.print("Enter new price Product: ");
                products.get(i).setProductPrice((Integer.parseInt(scanner.nextLine())));
            }

        }
    }

    public void deleteProduct() {
        System.out.print("Enter id product want to deleted: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == id) {
                products.remove(products.get(i));
            }
        }
    }

    public void displayProduct() {
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i));
        }
    }

    public void searchProductByName() {
        System.out.print("Enter name product to search: ");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().contains(name)) {
                System.out.print(products.get(i));
            }
        }
    }

    public void sortPriceUp() {
        products.sort(Comparator.comparing(Product::getProductPrice));
        displayProduct();
    }

    public void sortPriceDown() {
        products.sort(Comparator.comparing(Product::getProductPrice).reversed());
        displayProduct();
    }


}
