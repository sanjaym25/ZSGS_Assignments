package day_10.treeSet;

import java.util.*;

public class TreeSetNumberOperations {
    static Scanner scan = new Scanner(System.in);
    static TreeSet<Integer> numbers = new TreeSet<>();
    public static void createTreeSet(){
        System.out.print("How many Numbers Stored : ");
        int size = scan.nextInt();
        for(int i = 0;i<size;i++){
            System.out.print("Enter the Number : ");
            numbers.add(scan.nextInt());
        }
    }
    public static void main(String[] args) {
        // Create TreeSet
        createTreeSet();
        int choice;
        int val; 
        do {
            System.out.println("\nCurrent TreeSet: " + numbers);
            System.out.println("\nChoose an option:");
            System.out.println("1. Find numbers less than 7");
            System.out.println("2. Get element >= given element");
            System.out.println("3. Get element <= given element");
            System.out.println("4. Get element > given element");
            System.out.println("5. Get element < given element");
            System.out.println("6. Retrieve and remove first element");
            System.out.println("7. Retrieve and remove last element");
            System.out.println("8. Remove a specific element");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    // i. Find numbers less than 7
                    System.out.print("Enter The Number : ");
                    System.out.println(numbers.headSet(scan.nextInt()));
                    scan.nextLine();
                    break;
                case 2:
                    // j. Get element >= given element
                    System.out.print("Enter the value: ");
                    val = scan.nextInt();
                    Integer ceil = numbers.ceiling(val);
                    if (ceil != null)
                        System.out.println("Element >= " + val + " is: " + ceil);
                    else
                        System.out.println("No element found greater than or equal to " + val);
                    break;
                case 3:
                    // k. Get element <= given element
                    System.out.print("Enter the value: ");
                    val = scan.nextInt();
                    Integer folor = numbers.floor(val);
                    if (folor != null)
                        System.out.println("Element <= " + val + " is: " + folor);
                    else
                        System.out.println("No element found greater than or equal to " + val);
                    break;
                case 4:
                    // l. Get element > given element
                    System.out.print("Enter the value: ");
                    val = scan.nextInt();
                    Integer higer = numbers.higher(val);
                    if (higer != null)
                        System.out.println("Element > " + val + " is: " + higer);
                    else
                        System.out.println("No element found greater than or equal to " + val);
                    break;
                case 5:
                    // m. Get element < given element
                    System.out.print("Enter the value: ");
                    val = scan.nextInt();
                    Integer lower = numbers.lower(val);
                    if (lower != null)
                        System.out.println("Element > " + val + " is: " + lower);
                    else
                        System.out.println("No element found greater than or equal to " + val);
                    break;
                case 6:
                    // n. Retrieve and remove first element
                    System.out.println("Remove First : "+ numbers.pollFirst());
                    break;
                case 7:
                    // o. Retrieve and remove last element
                    System.out.println("Remove Last : "+ numbers.pollLast());
                    break;
                case 8:
                    // p. Remove a specific element
                    System.out.print("Enter Remove a specific element : ");
                    val = scan.nextInt();
                    boolean removeElement = numbers.remove(val);
                    scan.nextLine();
                    if(removeElement){
                        System.out.println("removed : "+ val);
                    }
                    else {
                        System.out.println(" Not removed : "+ val);
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        scan.close();
    }
}

