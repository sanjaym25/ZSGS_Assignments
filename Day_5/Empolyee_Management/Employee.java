package Day_5.Empolyee_Management;

public class Employee {
    private String employeeName;
    private String employeeId;
    private String role;
    static int idNo = 101;
    Employee(){

    }
    Employee(String empName,String empId,String role){
        idNo++;
        this.employeeName = empName;
        this.employeeId = empId+idNo;
        this.role = role;
    }
    
    // Setter and Getter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    // Setter and Getter for employeeId
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    // Setter and Getter for role
    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    public void calculateSalary(){
        System.out.println("calculateSalary!!!");
    }

    public void display(){
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
