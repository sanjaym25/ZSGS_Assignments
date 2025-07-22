/*
 5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.
 */
package Day_3.Inventory_System;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Show All Of The Operations
        Store store = new Store();
        System.out.println("****   Enter Store Details    ****\n");
        Store.setStoreDetails();
        while(true){
        System.out.println("Display Stroe Details : 1 \nAdd Product : 2 \nDisplay All Product : 3 \nExit : 4");
        System.out.print("Enter the Choice : ");
        int choice  = scan.nextInt();
        switch (choice) {
            case 1:
                Store.displayStoreDetails();
                break;
            case 2:
                store.addProduct();
                break;
            case 3:
                store.displayAllProduct();;
                break;
            default:
                System.exit(0);
                break;
        }
    }
    }
}
