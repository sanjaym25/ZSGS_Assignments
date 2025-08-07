/*
 * 3. Develop a Java program which illustrates the usage of Comparable Interface.
 */
package Day_8.Comparable_interface;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            sc.nextLine(); // consume newline
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Age: ");
            int age = sc.nextInt();

            students.add(new Student(name, id, age));
        }

        Collections.sort(students); // sort using Comparable by ID

        System.out.println("\n--- Sorted Student List by ID ---");
        for (Student stu : students) {
            System.out.println("Name: " + stu.name);
            System.out.println("ID: " + stu.id);
            System.out.println("Age: " + stu.age);
            System.out.println("-----------------------");
        }
        sc.close();
    }
}
