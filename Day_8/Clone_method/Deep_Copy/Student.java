package Day_8.Clone_method.Deep_Copy;

public class Student implements Cloneable {
    public int id;
    Address address;
    public Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        Student student = (Student) super.clone();
        student.address = (Address) address.clone();
        return student;
    }
}
