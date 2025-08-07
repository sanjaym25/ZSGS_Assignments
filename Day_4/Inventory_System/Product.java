package Inventory_System;

public class Product {
    // Instance Variable 
    int productId;
    String productName;
    int price;
    int quantity;
    // Assing The Product details
    Product(int productId, String productName, int price, int quantity){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Display product 
    public void displayProduct(){
        System.out.printf("Product Id :  %-7d  Product Name :  %-7s  Price : %-7d Quantity : %-7d \n\n",
                    this.productId, this.productName, this.price, this.quantity);
    }

}
