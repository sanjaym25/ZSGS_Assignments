package Day_7.Empolyee_Management_InterFace;

import java.util.ArrayList;

public class EmpDB {
    static ArrayList<Employee> employee = new ArrayList<>();
    public static Employee getEmployee(String empId){
        for(Employee emp : employee){
            if(emp.getEmployeeId().equals(empId)) return emp;
        }
        return null;
    }
    public static void display(){
        System.out.println("****          Employee Details          ****");
        for(Employee emp : EmpDB.employee){
            if(emp instanceof Fulltime_Employee){
            Fulltime_Employee e = (Fulltime_Employee) emp;
            System.out.printf("{ Employee Name : %-5s, Employee Id : %-5s, Employee Role : %-5s, Employee Salary : %-5f }\n\n",e.getEmployeeName(),e.getEmployeeId(),e.getRole(),e.salary);
            }
            if(emp instanceof PartTime_Employee){
            PartTime_Employee e = (PartTime_Employee) emp;
            System.out.printf("{ Employee Name : %-5s, Employee Id : %-5s, Employee Role : %-5s, Employee Salary : %-5f }\n\n",e.getEmployeeName(),e.getEmployeeId(),e.getRole(),e.salary);
            }
        }
    } 
}
