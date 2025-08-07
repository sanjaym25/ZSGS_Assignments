//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
package Day_8.Clone_method.Shallow_Copy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student(12,new Address("Tenkasi", "Tamil Nadu"));
        Student s2 = (Student) s1.clone();;
        s2.address.city = "Mathalamparai";
        // City affected in default clone is shallow copy
        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}
