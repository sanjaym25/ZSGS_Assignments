//3. Write a program to illustrate how to throw a ClassNotFoundException.
package Day_9;

public class Task_3 {

    public static void main(String[] args) {
        try{
            Class.forName("Day_9.Tas");
            System.out.println("Class Already Exits");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}