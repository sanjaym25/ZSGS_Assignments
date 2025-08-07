package Day_8.Clone_method.Shallow_Copy;

public class Student implements Cloneable {
    public int id;
    Address address;
    public Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
