package Day_3;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeDetails {
    static Scanner scan = new Scanner(System.in);
    // create Employee Data

    ArrayList<Employee2> employee = new ArrayList();

    // Set Employee Details

    public void setEmplayeeDetails(){
        System.out.println("***      Employee Details     ***");
        System.out.print("Enter The Employee : ");
        String name = scan.nextLine();
        System.out.print("Enter The Year Of Passing : ");
        int year = scan.nextInt();
        System.out.print("Enter The Salary : ");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the Address : ");
        String adderes =  scan.nextLine();
        employee.add(new Employee2(name, year, salary, adderes));

        System.out.println("****    Employee Added SuccessFully    ***");
    }
    
    // Display The Employee Details 
    public void displayEmployee(){
        System.out.println("***    Display Employee   ****");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-30s %-30s %-25s %-30s\n","Name","Year","Salary","Address");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for(Employee2 emp : employee){
            System.out.printf("%-30s  %-30d  %-25f  %-30s ",emp.name,emp.year_Of_joining,emp.salary,emp.address);
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }
    }
}