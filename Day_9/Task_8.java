/*
 * 8. Design a login system that throws AuthenticationException if the username or password is incorrect. 
 * Handle it and display a login failure message.
 */
package Day_9;
import java.util.ArrayList;
import java.util.Scanner;
public class Task_8{
    static ArrayList<Task_8> userAccount = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    String username;
    String password;
    Task_8(String username,String password){
        this.username = username;
        this.password = password;
    }
    public static void createAccount(){
        System.out.println("Enter The User Name : ");
        String username = scan.nextLine();
        System.out.println("Enter The Password : ");
        String password = scan.nextLine();
        Task_8 user = new Task_8(username, password);
        userAccount.add(user);
        System.out.println("****       Account Created SuccessFully      **** ");
    }
    public static void login(){
        System.out.print("Enter The User Name : ");
        String username = scan.nextLine();
        System.out.print("Enter The Password: ");
        String password = scan.nextLine();
        try{
            boolean check = false;
            for(Task_8 user : userAccount){
                if(user.username.equals(username) && user.password.equals(password)){
                    check = true;
                }
            }
            if(check)
            {
                System.out.println("***     Login SuccessFully     ****");
            }
            else 
            {
                throw new AuthenticationException();
            }    
            }
            catch(AuthenticationException e){
                System.out.println(e.getMessage());
            }
       }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you! Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        scan.close();
    }
}

class AuthenticationException extends Exception{
    AuthenticationException(){
        super("Athendictaed Faild Incorect UserName Or Password");
    }
}