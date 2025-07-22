// 3. Write a program to find the maximum of two numbers using ternary operator.

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter The Number1 : ");
        int num2 = scan.nextInt();
        maxiaum(num1,num2);
    }
    public static void maxiaum(int num1,int num2){
        int max = num1;
        max = num1<num2?num2:num1;// Check The Maxiaum Number
        System.out.println("Maxiaum Number: "+ max);
    }
}
