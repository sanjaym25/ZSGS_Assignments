package Day_7.RBI_System;

public class Customer {
    private String name;
    private int id;
    private int age;
    private String dob;

    public Customer(String name, int id, int age, String dob) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dob = dob;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
}
