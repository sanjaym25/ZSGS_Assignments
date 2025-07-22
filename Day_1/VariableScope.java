// 1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

import java.util.Scanner;
public class VariableScope{
    public static void main(String[] args) {
        Student student1 = new Student("sanjai",  242); // create Object Default Constructer Call
        student1.displayInfo();//Display The Information Student Details 
    }
}

class Student{
    static Scanner scan = new Scanner(System.in);
    String name; // instance variable
    static final String collegeName = "JP College";// static Variable
    int rollNo;
    Student(String name, int rollNo){ /// Constructur Assign The Value
        this.name = name;
        this.rollNo = rollNo;
    }
    // Display Information
    public void displayInfo(){
        System.out.print("Enter The Section : ");
        String section = scan.nextLine(); // Local Variable or Block Variable Inside The Method
        System.out.println("Student Name : "+name);
        System.out.println("College Name : "+collegeName);
        System.out.println("Roll No : "+rollNo);
        System.out.println("Section : "+section);
    }
}