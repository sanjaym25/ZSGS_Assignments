/*
 *2. Develop a Java program that illustrates the usage of the Comparator Interface.
 */
package Day_8.Comparator_Interface;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Enter details for Student " + i + " ---");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            students.add(new Student(name, id, age));
        }

        int choice;
        do {
            System.out.println("\n====== Sort Options ======");
            System.out.println("1. Sort by Name (A-Z)");
            System.out.println("2. Sort by ID (Lowest to Highest)");
            System.out.println("3. Sort by Age (Youngest to Oldest)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Collections.sort(students, new SortByName());
                    System.out.println("\n--- Students Sorted by Name  ---");
                    displayStudents(students);
                    break;
                case 2:
                    Collections.sort(students, new SortById());
                    System.out.println("\n--- Students Sorted by ID  ---");
                    displayStudents(students);
                    break;
                case 3:
                    Collections.sort(students, new SortByAge());
                    System.out.println("\n--- Students Sorted by Age ---");
                    displayStudents(students);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    // 💡 Display method
    public static void displayStudents(List<Student> list) {
        System.out.printf("%-15s %-10s %-10s\n", "Name", "ID", "Age");
        System.out.println("------------------------------------");
        for (Student s : list) {
            System.out.printf("%-15s %-10d %-10d\n", s.name, s.id, s.age);
        }
    }
}

