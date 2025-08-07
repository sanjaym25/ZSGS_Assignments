/*
 7. Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map
 */
package day_10.hashMap;

import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, String> newMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int choice;
        int key;
        String value;

        do {
            System.out.println("\n--- HashMap Operations Menu ---");
            System.out.println("1. Associate a value with a key");
            System.out.println("2. Count number of key-value mappings");
            System.out.println("3. Copy all mappings to another map");
            System.out.println("4. Remove all mappings from map");
            System.out.println("5. Check if map is empty");
            System.out.println("6. Get shallow copy of the map");
            System.out.println("7. Check if key exists");
            System.out.println("8. Check if value exists");
            System.out.println("9. Create set view of mappings");
            System.out.println("10. Get value for a specific key");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();  
            switch (choice) {
                case 1:
                    // Add logic to associate value with key
                    System.out.print("Enter The Key : ");
                    key = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter The Value : ");
                    value = scan.nextLine();
                    map.put(key, value);
                    break;
                case 2:
                    // Add logic to count key-value mappings
                    System.out.println("Size Of Map : "+map.size());
                    break;
                case 3:
                    // Add logic to copy map
                    if(!map.isEmpty()){
                    newMap.putAll(map);
                    System.out.println("Original : "+map);
                    System.out.println("Copy Map : "+newMap);
                    }
                    else{
                        System.out.println(" Map Is Empty ");
                    }
                    break;
                case 4:
                    // Add logic to remove all mappings
                    map.clear();
                    System.out.println("Clear()  : "+map);
                    break;
                case 5:
                    // Add logic to check if map is empty
                    if(map.isEmpty()){
                        System.out.println("Map Is Empty");
                    }
                    else {
                        System.out.println("Map Is Not EMpty");
                    }
                    break;
                case 6:
                    // Add logic to get shallow copy
                    HashMap<Integer,String> cloned = (HashMap<Integer,String>) map.clone();
                    System.out.println("Orginal : "+ map);
                    System.out.println("Cloned : "+cloned);
                    break;
                case 7:
                    // Add logic to check if key exists
                    if(!map.isEmpty()){
                        System.out.print("Enter The Key : ");
                        key = scan.nextInt();
                        scan.nextLine();
                        if(map.containsKey(key)){
                            System.out.println("Key Exits");
                        }
                        else{
                            System.out.println("Key does Not Exits");
                        }
                    }
                    else{
                        System.out.println("Map Is Empty");
                    }
                    break;
                case 8:
                    // Add logic to check if value exists
                        if(!map.isEmpty()){
                        System.out.print("Enter The Value : ");
                        value = scan.nextLine();  
                        if(map.containsValue(value)){
                            System.out.println("Value Exits");
                        }
                        else{
                            System.out.println("Value does Not Exits");
                        }
                    }
                    else{
                        System.out.println("Map Is Empty");
                    }
                    break;
                case 9:
                    // Add logic to create set view
                    Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
                    System.out.println("EntrySet : "+entrySet);
                    break;
                case 10:
                    // Add logic to get value by key
                    if(!map.isEmpty()){
                        System.out.print("Enter The Key : ");
                        key = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Get The Element : "+map.get(key));
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        scan.close();
    }
}

