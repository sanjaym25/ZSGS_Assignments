package Day_3;

public class Student {
    // Instance Of Variable 
    String name;
    int rollNo;
    long phoneNo;
    String address;
    // default Constructor
    Student(){

    }
    // Assign The Value Of Constructor
    Student(String name, int rollNo,long phoneNo,String address){
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    // print The Display Method Student Details

    public void display(){
        System.out.printf("{ name : %-7s, RollNo : %-5d, PhoneNo : %-7d, Address : %-7s }\n",name,rollNo,phoneNo,address);
    }
}
