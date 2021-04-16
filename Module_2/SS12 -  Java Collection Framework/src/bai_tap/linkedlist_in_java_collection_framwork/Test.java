package bai_tap.linkedlist_in_java_collection_framwork;

import java.util.Scanner;

public class Test extends ProductManager {
    public static void main(String[] args) {
        Test test = new Test();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------Product Manager App------------");
            System.out.println("-Enter 1 to add new Product----------------");
            System.out.println("-Enter 2 to edit Product-------------------");
            System.out.println("-Enter 3 to delete Product-----------------");
            System.out.println("-Enter 4 to search Product by name---------");
            System.out.println("-Enter 5 to sort Product by price down-----");
            System.out.println("-Enter 6 to sort Product by price up-------");
            System.out.println("-Enter 7 to show all Product --------------");
            System.out.println("-Enter 0 to exit !!!-----------------------");
            System.out.println("-------------------------------------------");
            System.out.print("Enter number: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("--- Add new Product ---");
                    test.addProduct();
                    break;
                case 2:System.out.println("--- Edit Product by ID ---");
                    test.editProduct();
                    break;
                case 3:
                    System.out.println("--- Delete Product by ID ---");
                    test.deleteProduct();
                    break;
                case 4:
                    System.out.println("--- Search Product by name ---");
                    test.searchProductByName();
                    break;
                case 5:
                    System.out.println("--- Sort Product by price down ---");
                    test.sortPriceDown();
                    break;
                case 6:
                    System.out.println("--- Sort Product by price up ---");
                    test.sortPriceUp();
                    break;
                case 7:
                    System.out.println("--- All Product ---");
                    test.displayProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
