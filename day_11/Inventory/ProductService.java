package Inventory;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    static Scanner scan = new Scanner(System.in);
    static File file;

    // Add Products
    public void addProduct(Product product) throws ClassNotFoundException {
        // File Path
        file = new File("day_11\\TextFile\\Product.dat");
        try {
            // Write the File Stream
            FileOutputStream write = new FileOutputStream(file, true);
            ObjectOutputStream oWrite;
            // Add The First Object
            if (file.length() == 0) {
                oWrite = new ObjectOutputStream(write);
            } else {
                // Append the Next Object Create Custom Class
                oWrite = new AppendingObjectOutputStream(write);
            }
            // Write the object File
            oWrite.writeObject(product);
            oWrite.flush();
            oWrite.close();
        }
        // handle Exception
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // View All products
    public void viewAllProduct() {
        try {
            // File Read Stream
            FileInputStream wrInputStream = new FileInputStream("day_11\\TextFile\\Product.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(wrInputStream);
            while (true) {
                try {
                    Product product2 = (Product) objectInputStream.readObject();
                    System.out.println(product2);
                }
                // Handle End Of File Exception.
                catch (EOFException e) {
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Serach product Id Based
    public void serachProduct(int productId) {
        try {
            // Read File Stream
            FileInputStream wrInputStream = new FileInputStream("day_11\\TextFile\\Product.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(wrInputStream);
            while (true) {
                try {
                    Product product2 = (Product) objectInputStream.readObject();
                    if (product2.getProductId() == productId) {
                        System.out.println(product2);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // delete The Product id based

    public void deleteProduct(int productId) {
        try {
            // Update The List Product
            ArrayList<Product> products = new ArrayList<>();
            // Read File Stream
            FileInputStream wrInputStream = new FileInputStream("day_11\\TextFile\\Product.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(wrInputStream);
            while (true) {
                try {
                    Product product2 = (Product) objectInputStream.readObject();
                    if (product2.getProductId() == productId) {
                        continue;
                    }
                    products.add(product2);
                }
                // Handle End Of File Exception.
                catch (EOFException e) {
                    break;
                }
            }
            // Serializeable Product
            serializable(products);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Update the Product Id Based

    public void updateProduct(int productId) {
        try {
            // update the Produts List
            ArrayList<Product> products = new ArrayList<>();
            // Read The File Stream
            FileInputStream wrInputStream = new FileInputStream("day_11\\TextFile\\Product.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(wrInputStream);
            while (true) {
                try {
                    Product product2 = (Product) objectInputStream.readObject();
                    if (product2.getProductId() == productId) {
                        update(product2);
                    }
                    products.add(product2);
                } catch (EOFException e) {
                    break;
                }
            }
            // Serializeable Product
            serializable(products);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Update the Product Set the Value
    public static void update(Product product2) {
        while (true) {
            System.out.println("1. Price\n2. Quantity\n3. Exit");
            System.out.print("Enter The Choice : ");
            int choice = Integer.parseInt(scan.nextLine());
            if (choice == 1) {
                System.out.print("Set the Price : ");
                product2.setPrice(scan.nextDouble());
                scan.nextLine();
            } else if (choice == 2) {
                System.out.print("Set the Quantity : ");
                product2.setQuantity(scan.nextInt());
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Wrong Choice");
            }
        }
    }

    // ReWrite The Serializable

    public static void serializable(ArrayList<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("day_11\\TextFile\\Product.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Product product : products) {
                objectOutputStream.writeObject(product);
            }
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
