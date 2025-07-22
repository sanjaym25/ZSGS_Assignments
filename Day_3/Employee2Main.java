/*
 6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
 */
package Day_3;
import java.util.Scanner;
public class Employee2Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        // Show The Employee Oprations 
        System.out.println("Employee Add : 1 \n Display Employee details : 2  Exit : 3");
        while(true){
          System.out.print("Enter the Choice : ");
          int choice = scan.nextInt();  
          switch (choice) {
            case 1:
                emp.setEmplayeeDetails();
                break;
            case 2:
                emp.displayEmployee();
                break;
          
            default:
                System.exit(1);
                break;
          }
        }
        
    }
}
