/*
 9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?
 */
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Sanjai", "CSE", 200000);
        Employee emp1 = new Employee(2, "indhu", "CSE", 200000);
        emp.display();
        emp1.display();
    }
}

class Employee{  
    // Instance Variable
    int empId;
    String name;
    String dept;
    double salary;
    // Initialized Assign The Value Constructer
    Employee(int empId,String name,String dept,double salary){
        this.empId = empId;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    // Display The Employee details
    void display(){
        System.out.println("Emp Id : "+empId);
        System.out.println("Emp Name : "+name);
        System.out.println("Emp Dep : "+dept);
        System.out.println("Emp Salary: "+salary);
    }
}
