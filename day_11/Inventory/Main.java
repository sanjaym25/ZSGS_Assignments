/*
 * 5. Design a Java application to manage a product inventory system using file handling and object serialization.
Create a class Product with the following attributes:
--->int productId
--->String name
--->double price
--->int quantity
a. Ensure the class implements the Serializable interface.
b. Methods:
--->Add a Product: Accept product details from the user and write the object to a file (products.dat).
--->View All Products: Read all product objects from the file and display them.
--->Search Product by ID: Search for a product by productId in the file and display its details if found.
--->Update Product: Locate a product in the file using the ID, update its price or quantity, and save the changes back to the file.
--->Delete Product: Remove a product object from the file by ID (involves rewriting the file).
--->Use proper exception handling and ensure that object serialization and deserialization are handled safely and efficiently.
 */
package Inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ProductService service = new ProductService();

        while (true) {
            System.out.println("\n===== Product Inventory Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();

                    System.out.print("Enter Product Quantity: ");
                    int quantity = scanner.nextInt();
                    Product product = new Product(id, name, price, quantity);
                    service.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println(" All Products:");
                    service.viewAllProduct();
                    break;

                case 3:
                    System.out.print(" Enter Product ID to Search: ");
                    int searchId = scanner.nextInt();
                    service.serachProduct(searchId);
                    break;

                case 4:
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = scanner.nextInt();
                    service.updateProduct(updateId);
                    break;

                case 5:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteProduct(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        }
    }
}
