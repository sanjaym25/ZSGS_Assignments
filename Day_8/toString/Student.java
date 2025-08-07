package Day_8.toString;

public class Student {
    public String name;
    public int age;
    public int id;
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString(){
        System.out.println("***   Student Details  ****");
        return "Name : "+this.name+
                "\nAge : "+this.age+
                "\nId  : "+this.id;
    }

}
