/*
 5. Design a Java application to manage a product inventory system using file handling and object serialization.
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

import java.io.Serializable;

public class Product implements Serializable {
    public int productId;
    private String name;
    private double price;
    public int quantity;

    // Assign the Value

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display the product details
    @Override
    public String toString() {
        System.out.println("\n***    Product Details    ***");
        return "\nProduct Name : " + this.getName() +
                "\nProduct Id   : " + this.getProductId() +
                "\nProduct Price : " + this.getPrice() +
                "\nProduct Quantity : " + this.getQuantity();
    }
}
