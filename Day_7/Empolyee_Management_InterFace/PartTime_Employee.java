package Day_7.Empolyee_Management_InterFace;

import java.util.Scanner;

public class PartTime_Employee extends Employee {
    static Scanner scan = new Scanner(System.in);
    double hourWorked;
    double rate;
    double salary; 
    static PartTime_Employee PartEmp;
    PartTime_Employee(){
        super();
    }
    PartTime_Employee(String empName,String empId,String role,double hourWorked,double rate,double salray ){
        super(empName,empId,role);
    }
    @Override
    public void calculateSalary(){
        System.out.print("Enter the Employee Hour Worked : ");
        this.hourWorked= scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the Hour Rate  : ");
        this.rate  = scan.nextDouble();
        scan.nextLine();
        this.salary = this.hourWorked*rate;
        for(Employee emp : EmpDB.employee){
            if(emp instanceof PartTime_Employee){
            PartTime_Employee downCast = (PartTime_Employee) emp;
            if(emp.getEmployeeId().equals(PartEmp.getEmployeeId())){
                downCast.hourWorked = this.hourWorked;
                downCast.rate = this.rate;
                downCast.salary = this.salary;
            }
        }
        }
         System.out.println("******         Salary Details        ****\n");
        System.out.println("Salary : "+this.salary+"\n");
    }

    public void addEmployee(){
        System.out.println("***     Welcome To Employee Management     ***\n");
        System.out.println("***       Part time Employee       ****\n");
        System.out.print("Enter the Employee Name : ");
        String empName = scan.nextLine();
        System.out.print("Enter the Employee Work  Type : ");
        String empRole = scan.nextLine();
        PartEmp = new PartTime_Employee(empName, "paEmp", empRole,0,0,0);
        EmpDB.employee.add(PartEmp);

         System.out.println("***       Employee Added SuccessFully      ***");
    }
}
