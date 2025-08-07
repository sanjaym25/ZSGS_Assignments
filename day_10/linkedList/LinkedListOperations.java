/*
2. Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.
 */
package day_10.linkedList;

import java.util.*;

public class LinkedListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int choice;
        do {
            System.out.println("\n=== LinkedList Menu ===");
            System.out.println("1. Append element to end");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Iterate from specific position");
            System.out.println("4. Iterate in reverse order");
            System.out.println("5. Insert at specific position");
            System.out.println("6. Insert at first and last");
            System.out.println("7. Insert at front");
            System.out.println("8. Insert at end");
            System.out.println("9. Insert group of elements at specific position");
            System.out.println("10. Get first and last occurrence of element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    // a. append element to end
                    System.out.print("Enter The Value : ");
                    list.addLast(scan.nextLine());
                    break;

                case 2:
                    // b. iterate through all elements
                    System.out.print("{ ");
                    for(String name : list){
                        System.out.print(name+", ");
                    }
                    System.out.println(" }");
                    break;

                case 3:
                    // c. iterate from specified position
                    System.out.print("Enter The Specified Position : ");
                    int position = scan.nextInt();
                    scan.nextLine();
                    Iterator<String> iterator = list.listIterator(position);
                    while(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;

                case 4:
                    // d. iterate in reverse order
                    Iterator<String> reverse = list.descendingIterator();
                    while(reverse.hasNext()){
                        System.out.println(reverse.next());
                    }
                    break;

                case 5:
                    // e. insert at specific position
                    System.out.print("Insert at Specific Position ");
                    int idx = Integer.parseInt(scan.nextLine());
                    System.out.println("Insert At Value : ");
                    String value = scan.nextLine();
                    list.add(idx,value);
                    break;

                case 6:
                    // f. insert at first and last
                    System.out.println("Insert at First Value : ");
                    list.addFirst(scan.nextLine());
                    System.out.println("Insert at Last Value : ");
                    list.addLast(scan.nextLine());
                    break;

                case 7:
                    // g. insert at front
                    System.out.println("Insert at front Value : ");
                    list.addFirst(scan.nextLine());
                    break;

                case 8:
                    // h. insert at end
                    System.out.println("Insert at End Value : ");
                    list.addLast(scan.nextLine());
                    break;

                case 9:
                    // i. insert group at position
                    System.out.print("Enter The New LinkedList How Many Values insert size : ");
                    int size = scan.nextInt();
                    scan.nextLine();
                    LinkedList<String> li = new LinkedList<>();
                    for(int i = 0;i<size;i++){
                        System.out.print("Enter The Value : ");
                        li.add(scan.nextLine());
                    }
                    System.out.print("Insert Group at Position");
                    list.addAll(scan.nextInt(), li);
                    scan.nextLine();
                    break;

                case 10:
                    //j. get first and last occurrence
                    System.out.println("First Occurrence : "+ list.getFirst());
                    System.out.println("Last Occurrence : "+ list.getLast());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            System.out.println("Current LinkedList: " + list);

        } while (choice != 0);

        scan.close();
    }
}
