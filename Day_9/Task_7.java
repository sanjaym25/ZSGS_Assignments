//7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.
package Day_9;

public class Task_7 {
    public static void employee(){
        int quotient = 10/0;
    }
    public static void teamLead(){
        employee();
    }
    public static void manager(){
        try{
        teamLead();
        }
        catch(ArithmeticException e){
            System.out.println("handled Excetion Manager : "+e);
        }
    }

    public static void main(String arg[]){
        manager();
        System.out.println("Exception Handled Excuted The Next Process");
    }
}
