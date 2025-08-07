/*
 6. Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
 */
package day_10.treeMap;

import java.util.*;

public class TreeMapMenuExample {

    static TreeMap<Integer, String> map1 = new TreeMap<>();
    static TreeMap<Integer, String> map2 = new TreeMap<>();
    static Scanner scan = new Scanner(System.in);
    public static void createtreeMap(){
        System.out.print("Enter The  Size : ");
        int size = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<size;i++){
            System.out.print("Enter The Key : ");
            int key = Integer.parseInt(scan.nextLine());
            System.out.print("Enter The Value : ");
            String value = scan.nextLine();
            map1.put(key, value);
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- TreeMap Menu ---");
            System.out.println("1. Associate value with key");
            System.out.println("2. Copy TreeMap to another TreeMap");
            System.out.println("3. Search for a key");
            System.out.println("4. Search for a value");
            System.out.println("5. Get all keys");
            System.out.println("6. Delete all elements");
            System.out.println("7. Sort keys using Comparator");
            System.out.println("8. Get mapping with greatest and least key");
            System.out.println("9. Get first and last keys");
            System.out.println("10. Get reverse order view of keys");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline
            System.out.println("Current : "+map1);
            switch (choice) {
                case 1:
                    // Associate a value with a key
                    createtreeMap();
                    break;
                case 2:
                    // Copy content of map1 to map2
                    map2.putAll(map1);
                    System.out.println("Map 2 : "+ map2);
                    break;
                case 3:
                    //Search a key in map1
                    System.out.print("Enter the Key : ");
                    System.out.println("Search a key  : "+map1.containsKey(scan.nextInt()));
                    scan.nextLine();
                    break;
                case 4:
                    // Search a value in map1
                    System.out.print("Enter the Value : ");
                    System.out.println("Search a Value  : "+map1.containsValue(scan.nextLine()));
                    break;
                case 5:
                    // Get all keys from map1
                    if(!map1.isEmpty()){
                    System.out.println("Get all keys : "+map1.keySet());
                    }
                    else{
                        System.out.println("Map Is Empty");
                    }
                    break;
                case 6:
                    // Clear all elements from map1
                    map1.clear();
                    System.out.println("Clear all elements : "+map1);
                    break;
                case 7:
                    //Sort keys using Comparator (custom order)
                    if(!map1.isEmpty()){
                    TreeMap<Integer,String> sort = new TreeMap<>(Comparator.reverseOrder()); 
                    sort.putAll(map1);
                    System.out.println(sort);
                    }
                    else{
                        System.out.println("Map Is Empty");
                    }
                    break;
                case 8:
                    // Get entry with greatest and least key
                    if(!map1.isEmpty()){
                        System.out.println("least key : "+map1.firstEntry());
                        System.out.println("greatest key : "+map1.lastEntry());
                    }
                    else{
                        System.out.println("Map Is Empty");
                    }
                    break;
                case 9:
                    // Get first and last key
                    System.out.println("First Key : "+map1.firstKey());
                    System.out.println("Last Key : "+map1.lastKey());
                    break;
                case 10:
                    // Reverse order view of keys
                    if(!map1.isEmpty()){
                        NavigableMap<Integer,String> reversMap = map1.descendingMap();
                        System.out.println("Reverse Map : "+ reversMap);
                    }
                    else {
                        System.out.println("Map is Empty");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}

