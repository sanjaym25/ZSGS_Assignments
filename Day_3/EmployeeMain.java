/*
 3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
  a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
 */
package Day_3;
import Day_3.Employee;
public class EmployeeMain {

    public static void main(String[] args) {

        // Create Object call the Default ConStructor
        Employee emp = new Employee();
        System.out.println("****   Defalut Constructor   ***");
        emp.display();
        // Create Object Call The Parametrized constructor
        
        Employee emp1 = new Employee("Sanjai",1,"Software Devloper",74000);
        System.out.println("****   Parametrized Constructor   ***");
        emp1.display();
        // Copy constructor Is A Copy Of the Object

        Employee emp2 = new Employee(emp1);
        System.out.println("****   Copy Constructor   ***");
        emp2.display();
    }
}
