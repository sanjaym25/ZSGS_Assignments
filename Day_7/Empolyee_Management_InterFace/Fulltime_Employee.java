package Day_7.Empolyee_Management_InterFace;

import java.util.Scanner;

public class Fulltime_Employee extends Employee {
    static Scanner scan = new Scanner(System.in);
    double basepay;
    double bonus;
    double deductions;
    double salary;
    static Fulltime_Employee fullEmp;
    Fulltime_Employee(){
        super();
    }
    Fulltime_Employee(String empName,String empId,String role,double basepay,double bouns,double deductions,double salray ){
        super(empName,empId,role);
        this.basepay = basepay;
        this.bonus = bouns;
        this.deductions = deductions;
    }
    @Override
    public void calculateSalary(){
        System.out.print("Enter the Employee Bonus : ");
        this.bonus = scan.nextDouble();
        System.out.print("Enter the Employee deductions : ");
        this.deductions  = scan.nextDouble();
        this.salary = (fullEmp.basepay+this.bonus)-this.deductions;
        System.out.println(salary);
        for(Employee emp : EmpDB.employee){
            if(emp instanceof Fulltime_Employee){
            Fulltime_Employee downCast = (Fulltime_Employee) emp;
            if(emp.getEmployeeId().equals(fullEmp.getEmployeeId())){
                downCast.bonus = this.bonus;
                downCast.deductions = this.deductions;
                downCast.salary = this.salary;
            }
            }
        }
        System.out.println("******         Salary Details        ****\n");
        System.out.println("Salary : "+this.salary+"\n");
    }

    public void addEmployee(){
        System.out.println("***     Welcome To Employee Management     ***");
        System.out.print("Enter the Employee Name : ");
        String empName = scan.nextLine();
        System.out.print("Enter the Employee Work Type : ");
        String empRole = scan.nextLine();
        System.out.print("Enter the Employee Basepay : ");
        double basepay = scan.nextDouble();
        scan.nextLine();
        fullEmp = new Fulltime_Employee(empName, "Emp", empRole,basepay,0,0,0);
        EmpDB.employee.add(fullEmp);

        System.out.println("***       Employee Added SuccessFully      ***");
    }
}
