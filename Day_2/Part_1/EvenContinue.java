/*
5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
 */
package Day_2.Part_1;

import java.util.Scanner;

public class EvenContinue {
    public static void main(String[] args) {
        // Check Even Number using
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scan.nextInt();
    }
    // Sum Of Even Number
    public static void evenSum(int n){
        int sum = 0;
        for(int i = 0;i<=n;i++){
            if(i%2 != 0) continue;
            sum+=i;
        }
        System.out.println("Even Number Sum : "+ sum);
    }   
}
