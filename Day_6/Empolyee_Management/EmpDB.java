package Day_6.Empolyee_Management;

import java.util.ArrayList;

public class EmpDB {
    static ArrayList<Employee> employee = new ArrayList<>();
    public static Employee getEmployee(String empId){
        for(Employee emp : employee){
            if(emp.getEmployeeId().equals(empId)) return emp;
        }
        return null;
    } 
}
