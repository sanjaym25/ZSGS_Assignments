/*
 4. Write a Java program to,
a. create a new tree set, add some colours (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
Create a TreeSet that stores a set of numbers,   
i. find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
 */
package day_10.treeSet;

import java.util.*;
public class TreeSetStringOperartions {
    static TreeSet<String> treeSet = new TreeSet<>();
    static Scanner scan = new Scanner(System.in);
    public static void createtreeSet(){
        System.out.print("Enter The  Size : ");
        int size = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<size;i++){
            System.out.print("Enter The Color : ");
            treeSet.add(scan.nextLine());
        }
    }
    public static void display(){
        for(String color : treeSet){
            System.out.println(color);
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- TreeSet Operations ---");
            System.out.println("1. Create TreeSet and Add Colours");
            System.out.println("2. Iterate through TreeSet");
            System.out.println("3. Add all elements from one TreeSet to another");
            System.out.println("4. Reverse order view of TreeSet");
            System.out.println("5. Get First and Last Elements");
            System.out.println("6. Clone TreeSet");
            System.out.println("7. Get Number of Elements");
            System.out.println("8. Compare Two TreeSets");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // Clear newline

            switch (choice) {
                case 1:
                    // a. create a new tree set, add some colours (string) and print out the tree set.
                    createtreeSet();
                    display();
                    break;
                case 2:
                    // b. iterate through all elements in a tree set.
                    display();
                    break;
                case 3:
                    // c. add all elements of one TreeSet to another.
                    TreeSet<String> treeset2 = new TreeSet<>();
                    treeset2.addAll(treeSet);
                    System.out.println("Add All Element : "+treeset2);

                    break;
                case 4:
                    // d. reverse order view of the TreeSet.
                    System.out.println("Orinals : "+ treeSet);
                    NavigableSet<String> reverse = treeSet.descendingSet();
                    System.out.println("Reverse : "+ reverse);
                    break;
                case 5:
                    // e. get the first and last elements.
                    System.out.println("First : "+treeSet.first());
                    System.out.println("Last : "+treeSet.last());
                    break;
                case 6:
                    // f. clone TreeSet to another TreeSet.
                    TreeSet<String> cloned = (TreeSet<String>) treeSet.clone();
                    System.out.println("Orginal : "+ treeSet);
                    System.out.println("Cloned  : "+ cloned);
                    break;
                case 7:
                    // g. get the number of elements.
                    System.out.println("Size : "+treeSet.size());
                    break;
                case 8:
                    // h. compare two TreeSets.
                        System.out.println("Create New TreeSet Size : ");
                        int size = scan.nextInt();
                        scan.nextLine();
                        TreeSet<String> tset = new TreeSet<>();
                        for(int i = 0;i<size;i++){
                            System.out.print("Enter The Value : ");
                            tset.add(scan.nextLine());
                        }
                        if(tset.equals(treeSet)){
                            System.out.println("Equals To Object ");
                        }
                        else {
                            System.out.println("Not Equals To Object ");
                        }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);
    }
}
