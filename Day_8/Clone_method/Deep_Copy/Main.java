//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
package Day_8.Clone_method.Deep_Copy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student(12,new Address("Tenkasi", "Tamil Nadu"));
        Student s2 = (Student) s1.clone();

        // s2 object by changed city

        s2.address.city = "Mathalamparai";
        // No affected The original data this DeepCopy
        System.out.println(s1.address.city); // Tenkasi
        System.out.println(s2.address.city); // Mathalamparai
    }
}
