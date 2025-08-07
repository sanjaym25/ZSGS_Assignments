
/* 1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/
package Day_9;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter The Index Number 1 : ");
       int index = scan.nextInt();
       System.out.print("Enter The Index Number 2 : ");
       int index1 = scan.nextInt();
       int[] arr = {2, 5, 1, 4, 0, 7};
       try{
       int quotient = arr[index] / arr[index1];
       System.out.println(quotient);
       }
       catch(ArithmeticException e){
        e.printStackTrace();
       }
       catch(ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
       }
    }   
}
