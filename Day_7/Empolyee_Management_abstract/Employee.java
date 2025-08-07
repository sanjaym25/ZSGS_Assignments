package Day_7.Empolyee_Management_abstract;

public abstract class Employee {
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

    public abstract void calculateSalary();
}
