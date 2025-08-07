/*
 5. Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.
 */
package day_10.priority_queue;

import java.util.*;

public class PriorityQueueExample{

    static PriorityQueue<String> pq1 = new PriorityQueue<>();
    static PriorityQueue<String> pq2 = new PriorityQueue<>();
    static Scanner scan = new Scanner(System.in);

    public static void createPq1(){
        System.out.print("Enter The  Size : ");
        int size = scan.nextInt();
        scan.nextLine();
        for(int i = 0;i<size;i++){
            System.out.print("Enter The Color : ");
            pq1.add(scan.nextLine());
        }
    }
    public static void display(){
        for(String color : pq1){
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n----- Priority Queue Menu -----");
            System.out.println("1. Create and add colors");
            System.out.println("2. Iterate through elements");
            System.out.println("3. Add elements from one PQ to another");
            System.out.println("4. Insert a new element");
            System.out.println("5. Remove all elements");
            System.out.println("6. Count number of elements");
            System.out.println("7. Compare two PriorityQueues");
            System.out.println("8. Retrieve first element (peek)");
            System.out.println("9. Retrieve and remove first element (poll)");
            System.out.println("10. Convert PQ to array");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Create and add colors to pq1
                    createPq1();
                    break;
                case 2:
                    // Iterate through pq1
                    display();
                    break;
                case 3:
                    // Add all elements from pq1 to pq2
                    pq2.addAll(pq1);
                    System.out.println("Add All Element : "+pq2);
                    break;
                case 4:
                    // Insert a new element into pq1
                    System.out.print("Enter the Value : ");
                    pq1.add(scan.nextLine());
                    break;
                case 5:
                    // Remove all elements from pq1
                    pq1.clear();
                    System.out.println(pq1);
                    break;
                case 6:
                    // Count elements in pq1
                    System.out.println("Count elements : "+pq1.size());
                    break;
                case 7:
                    // Compare pq1 and pq2
                    if(pq1.equals(pq2)){
                        System.out.println("Equals To Object");
                    }
                    else{
                        System.out.println("Not Equals To Object");
                    }
                    break;
                case 8:
                    // Retrieve first element using peek()
                    System.out.println("Retrieve first element  using peek() : "+pq1.peek());
                    break;
                case 9:
                    // Retrieve and remove first element using poll()
                     System.out.println("Retrieve and remove first element using poll() : "+pq1.poll());
                    break;
                case 10:
                    // Convert pq1 to array
                    System.out.println("Convert pq1 to array : "+Arrays.toString(pq1.toArray()));
                    break;
                case 0:
                    System.out.println("Exiting... ");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
}
}