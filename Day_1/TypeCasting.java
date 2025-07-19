// 6. Write a program that illustrate the Explicit type casting?

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       long num1 = num; // implicit Type casting

       // Explicit Type casting 
       byte n1 = (byte) num;
       short n2 = (short) num;   
       float weight = 56.6f;
       double dWeight = (double) weight;

       System.out.println("int : "+ num);
       System.out.println("long : "+ num);
       System.out.println("byte : "+ num);
       System.out.println("short : "+ num);
       System.out.println("float : "+ weight);
       System.out.println("double : "+ dWeight);
    }
}
