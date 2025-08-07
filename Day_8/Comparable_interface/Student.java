package Day_8.Comparable_interface;
public class Student implements Comparable<Student> {
    public String name;
    public int id;
    public int age;
    Student(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public int compareTo(Student student){
        return this.id - student.id;
    }
}

