// 7. Write a program to check if a number is a power of 2?
import java.util.Scanner;
public class PowOfTwo {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter The Number : ");
    int n = scan.nextInt();
    System.out.println("Pow Of Two : "+pow(n));
   }  
   public static boolean pow(int n){
        if(n == 1) return true;
        if(n%2 == 1) return false;
        return pow(n/2);
   }
}
