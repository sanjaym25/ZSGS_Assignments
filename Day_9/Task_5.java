/*
 5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.
 */
package Day_9;

public class Task_5 {
    public static void main(String[] args) {
        //Second Excuted Print The Return value
        System.out.println("Return Number : "+testMethod());
    } 
    public static int testMethod(){
        try{
            return 10;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            // First Excuted Finally Block This Case
            System.out.println("Excuted Finaly Block ");
        }
        return 20;
    }
}
