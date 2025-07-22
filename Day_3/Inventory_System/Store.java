package Day_3.Inventory_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    static String storeName;
    static String location;
    static Scanner scan = new Scanner(System.in);
    ArrayList<Product> inventory = new ArrayList<>(); // All Product Store inventory
    // Set the Stroe Details
    public static void setStoreDetails() { 
        System.out.print("Enter the Store Name : ");
        storeName = scan.nextLine();
        System.out.print("Enter the Store Location : ");
        location = scan.nextLine();

        System.out.println("****    Set The Store Details SuccessFully    ***\n");
    }
    // Display The Store Details
    public static void displayStoreDetails() {
        System.out.println("****   Store Location   ***\n");
        System.out.println("Stroe Name : " + storeName);
        System.out.println("Stroe Location : " + location);
        System.out.println("****   Details Displayed SuccessFully    ***\n");
    }
    
    // Add The Product In product List
    public void addProduct() {
        System.out.println("****       Product Add Page     ***\n");
        System.out.print("Product Id : ");
        int productId = scan.nextInt();
        scan.nextLine();
        System.out.print("Product Name : ");
        String productName = scan.nextLine();
        System.out.print("Product Price : ");
        int price = scan.nextInt();
        scan.nextLine();
        System.out.print("Product Quantity : ");
        int quantity = scan.nextInt();
        boolean check = true;

        for (Product product : inventory) {
            // Check Product Already Exits
            if (product.productId == productId) { // Update The Product Quantity
                product.quantity += quantity;
                check = false;
            }
        }
        if (check) {
            inventory.add(new Product(productId, productName, price, quantity)); // Add new product
        }

        System.out.println("***     Product Added SuccussFully    ***\n");
    }
    // Display The All Products
    public void displayAllProduct() {
        System.out.println("***      All Product Display Page      ****\n");
        for (Product product : inventory) {
            product.displayProduct();
        }
        System.out.println("***      All Product Displayed     ****\n");
    }
}
