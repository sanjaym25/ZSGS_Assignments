/*
 * 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable
 */
package Day_8.Cloneable_Inteface.Shallow_Copy;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException{
        // Cloneable interface Implement using Clone the Object
        Student s1 = new Student(12,new Address("Tenkasi", "Tamil Nadu"));
        Student s2 = (Student) s1.clone();;
        s2.address.city = "Mathalamparai";
        // City affected in default clone is shallow copy
        System.out.println(s1.address.city);
        System.out.println(s2.address.city);

        // Cloneable interface Not implement using Clone the Object
        Student2 student2 = new Student2("sanjai",2574);
        Student2 student22 = (Student2) student2.clone();
    }
}
