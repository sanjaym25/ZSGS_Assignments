package Day_2;

import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Give The Scanner Input
        System.out.print("Enter The Number 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter The Number 2 : ");
        int num2 = scan.nextInt();
        System.out.print("Enter The Number 3 : ");
        int num3 = scan.nextInt();
        int min = num1;

        // Check Logic Of Minimum Number
        if(num1<num2 && num1<num3) min = num1;
        else if(num2<num1 && num2<num3) min = num2;
        else min = num3;

        // Print Minimum Number
        System.out.println("Minimum Number In Three Number : "+min);


    }
}
