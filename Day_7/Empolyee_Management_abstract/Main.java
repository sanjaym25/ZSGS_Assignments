/*
 3. Create a Java application to manage employees in a company. 
 Define an abstract class Employee with a method calculateSalary(). 
 Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
 */
package Day_7.Empolyee_Management_abstract;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("***       Employee management System    ****\n");
        while(true){
            System.out.println("Full Time Employee : 1\nPart Time Employee : 2\nDisplay Salary : 3\nDisplay Employee Details : 4\nExit : 5\n");
            System.out.print("Enter The Number :");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    Fulltime_Employee fullEmp = new Fulltime_Employee();
                    fullEmp.addEmployee();   
                    break;
                case 2:
                    PartTime_Employee partEmp = new PartTime_Employee();
                    partEmp.addEmployee();
                    break;
                case 3:
                    System.out.print("Enter the EmployeeId : "); 
                    String empId = scan.nextLine();
                    Employee emp = EmpDB.getEmployee(empId);
                    if(emp != null){
                        if(emp instanceof Fulltime_Employee){
                            Fulltime_Employee fulltime_Employee = (Fulltime_Employee) emp;
                            fulltime_Employee.calculateSalary(); 
                        }
                        if(emp instanceof PartTime_Employee){
                            PartTime_Employee partTime_Employee = (PartTime_Employee) emp;
                            partTime_Employee.calculateSalary(); 
                        }
                    }
                    else System.out.println("***   Employee Id Miss Match   ****");

                    break;

                case 4:
                    EmpDB.display();  
                    break;  
                default:
                    System.exit(0);
            }
        }
    }
}
