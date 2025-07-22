/*
 
 */
package Day_3;

public class Employee {
    String empName;
    int empId;
    String designation;
    double salary;

    /*
     defalut constructor will created
     Asign The Value of Defalut value In defalut
    */ 
    Employee(){
       
    }
    /*
      Parametrized constructor This constructor 
      Assign Value Manual Set The Value Of Parametrized constructor
    */
    Employee(String empName,int empId,String designation, double salary){
       this.empName =empName;
       this.empId = empId;
       this.designation = designation;
       this.salary = salary;
    }
    /*
     Copy Constructor Is A Assign The Copy Of Object
     */
    Employee(Employee employee){
        this.empName = employee.empName;
        this.empId = employee.empId;
        this.designation  = employee.designation;
        this.salary = employee.salary;
    }
    // Display Employeee details
    public void display(){
        System.out.printf("{ Emplayee Name : %-7s, Emplayee Id : %-5d, Designation : %-7s, Salary : %-7f }\n",this.empName,this.empId,this.designation,this.salary);
    }
}
