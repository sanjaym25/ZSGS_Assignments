// 4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter The Number1 : ");
        int num2 = scan.nextInt();
        switch(num1-num2){
            case 0:
            System.out.print("Given The Two Number Equal : ");//The Number Equal Statement
            break;
            default:
            System.out.print("Given The Two Number Not Equal : ");// The Number not Equals
        }

    }   
}
